package com.xuejun.dao.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.xuejun.dao.UserDao;
import com.xuejun.entity.User;

public class UserDaoImpl implements UserDao{

	public void save(Connection conn, User user) throws SQLException {
		// TODO Auto-generated method stub
		String saveSql="insert into tbl_user (name,password,email)values(?,?,?)";
		PreparedStatement ps=conn
				.prepareCall(saveSql);
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		ps.execute();
	}

	@Override
	public void update(Connection conn, User user,Long id) throws SQLException {
		// TODO Auto-generated method stub
		String updateSql="update tbl_user set name=?,password=?,email=?where id=?";
		PreparedStatement ps=conn
				.prepareCall(updateSql);
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		ps.setLong(4, id);
		ps.execute();
	}

	@Override
	public void delete(Connection conn, User user) throws SQLException {
		// TODO Auto-generated method stub
		String deleteSql="delete from tbl_user where id=?";
		PreparedStatement ps=conn
				.prepareCall(deleteSql);
		ps.setLong(1, user.getId());
		ps.execute();
		
	}

	@Override
	public ResultSet get(Connection conn, User user) throws SQLException {
		// TODO Auto-generated method stub
		String querySql="select * from tbl_user where name=? and password=?";
		PreparedStatement ps=conn
				.prepareCall(querySql);
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		
		return ps.executeQuery();
		
	}

	

}
