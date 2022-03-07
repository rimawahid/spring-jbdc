package com.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.model.Teacher;

public class TeacherDaoImpl implements TeacherDao{

	private JdbcTemplate jdbcTemplate;
	public int insert(Teacher teacher) {
		// insert query
		String query = "insert into teacher(id, name, salary) values (?,?,?)";
		int r =this.jdbcTemplate.update(query, teacher.getId(), teacher.getName(), teacher.getSalary());
		return r;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

}
