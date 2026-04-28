package com.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		DataSource dataSource = dataSource();
		return new JdbcTemplate(dataSource);
		
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl("jdbc:mysql://localhost:3306/hibernate");
		datasource.setUsername("root");
		datasource.setPassword("root");
		return datasource;
		
	}
	
}
