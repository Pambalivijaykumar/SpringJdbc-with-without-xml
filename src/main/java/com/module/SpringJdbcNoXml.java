package com.module;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.config.Config;
import com.entity.Student;

public class SpringJdbcNoXml {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate template = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
		
		List<Student> query = template.query("select * from student", new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

				return new Student(rs.getInt(1),rs.getInt(2), rs.getString(3));
			}
			
		});
		System.out.println(query);
//		queryForObject(template);
//		dmlOps(template);
//		dmlDelete(template);
	}

	private static void queryForObject(JdbcTemplate template) {
		Student queryForObject = template.queryForObject("select * from student where studentid = ? ", new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

				return new Student(rs.getInt(1),rs.getInt(2), rs.getString(3));
			}
			
		},3);
		
		System.out.println(queryForObject);
	}

	private static void dmlDelete(JdbcTemplate template) {
		template.update("delete from student where studentid = ? ", 11);
	}

	private static void dmlOps(JdbcTemplate template) {
		template.update("insert into student values(?,?,?)", 3, 55, "Kumar");
		template.update("update student set marks = ? where studentid = ?", 88, 3);
	}

}
