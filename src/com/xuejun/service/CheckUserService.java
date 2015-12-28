package com.xuejun.service;

import java.sql.Connection;
import java.sql.ResultSet;

import com.xuejun.dao.UserDao;
import com.xuejun.dao.implement.UserDaoImpl;
import com.xuejun.entity.User;
import com.xuejun.util.ConnectFactory;

public class CheckUserService {
	private UserDao userDao=new UserDaoImpl();
	public boolean check(User user){
		Connection conn=null;
		try {
			conn=ConnectFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);
			ResultSet resultSet=userDao.get(conn, user);
			while(resultSet.next()){
				return true;
			}
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
			try {
				conn.rollback();
				
			} catch ( Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();	
			}
		}finally{
			try {
				conn.close();
			} catch (Exception e3) {
				// TODO: handle exception
				e3.printStackTrace();
			}
		}
		return false;
	}

}
