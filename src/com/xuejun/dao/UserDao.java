package com.xuejun.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.xuejun.entity.User;

public interface UserDao {
	public void save(Connection conn, User user )throws SQLException;
	public void delete(Connection conn, User user )throws SQLException;
	public ResultSet get(Connection conn, User user)throws SQLException;
	void update(Connection conn, User user, Long id) throws SQLException;
	
}
