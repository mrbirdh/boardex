package com.example.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@Autowired
	private BoardDao dao;
	
	@RequestMapping("/")
	public String start(Model model) {
		model.addAttribute("list", dao.getAll());
		return "main";
	}
	
	@RequestMapping("ajax")
	@ResponseBody
	public String ajax(int u_id, String u_name, int u_price) {
		int result = dao.update(new BoardDto(u_id,u_name,u_price));
		if (result != 0) {
			return "update OK";
		}else {
			return "update Failed";
		}
	}
}
