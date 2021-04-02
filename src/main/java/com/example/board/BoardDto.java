package com.example.board;

public class BoardDto {
	private int u_id;
	private String u_name;
	private int u_price;
	
	public BoardDto() {}

	public BoardDto(int u_id, String u_name, int u_price) {
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_price = u_price;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public int getU_price() {
		return u_price;
	}

	public void setU_price(int u_price) {
		this.u_price = u_price;
	}

	@Override
	public String toString() {
		return "BoardDto [u_id=" + u_id + ", u_name=" + u_name + ", u_price=" + u_price + "]";
	}
	
	
}
