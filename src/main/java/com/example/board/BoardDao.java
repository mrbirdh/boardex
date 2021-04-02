package com.example.board;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {
	@Autowired
	private JdbcTemplate sTmp;
	
	public BoardDto[] getAll () {
		String query = "SELECT * FROM board";
		return sTmp.query(query, new BoardDtoMapper()).toArray(new BoardDto[0]);
	}
	
	public int update(BoardDto dto) {
		String query = "UPDATE something SET u_name = ? , u_price= ? WHERE u_id = ?";
		return sTmp.update(query, dto.getU_name(), dto.getU_price(), dto.getU_id());
	}
	
	private class BoardDtoMapper implements RowMapper<BoardDto> {
		@Override
		public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new BoardDto(
						rs.getInt("u_id"),
						rs.getString("u_name"),
						rs.getInt("u_price")
					);
		}
		
	}
	
	
}
