package com.vrun;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Dao {
	JdbcTemplate jdbcTemplate;

	public Dao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void create() {
		System.out.println("starting");
		String sql ="create table GG (name varchar(20),id number(20))";
		jdbcTemplate.execute(sql);
		System.out.println("over");
	}
	public void insert(Pojo p) {
		String sql="insert into GG values('"+p.getName()+"',"+p.getId()+")";
		jdbcTemplate.execute(sql);
		System.out.println("inserted");
	}
	public void update(Pojo p) {
		String sql="update GG set name='"+p.getName()+"' where id="+p.getId()+"";
		jdbcTemplate.execute(sql);
		System.out.println("updated");
	}
	public void delete(int id) {
		String sql="delete from GG where id="+id+"";
		jdbcTemplate.execute(sql);
		System.out.println("deleted");
	}
	public List<Pojo> retrive(Pojo pojo) {
		String sql="select * from GG";
		return jdbcTemplate.query(sql, new RowMapper<Pojo>(){

			public Pojo mapRow(ResultSet rs, int rowNum) throws SQLException {
				Pojo p=new Pojo();
				p.setName(rs.getString(1));
				p.setId(rs.getInt(2));
				return p;
			}
			
		});
	}
	public List<Pojo> getdatabyid(int id) {
		String sql="select * from GG where id="+id+"";
		return jdbcTemplate.query(sql, new RowMapper<Pojo>(){

			public Pojo mapRow(ResultSet rs, int rowNum) throws SQLException {
				Pojo p=new Pojo();
				p.setName(rs.getString(1));
				p.setId(rs.getInt(2));
				return p;
			}
			
		});
		
	}
}
