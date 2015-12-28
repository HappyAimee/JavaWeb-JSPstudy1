package com.xuejun.test;

import java.sql.Connection;
import java.sql.ResultSet;

import com.xuejun.dao.UserDao;
import com.xuejun.dao.implement.UserDaoImpl;
import com.xuejun.entity.User;
import com.xuejun.util.ConnectFactory;

public class JDBCtest {
	public static void main(String[] args) {
		UserDao userDao=new UserDaoImpl();
		User user=new User();
		user.setName("xiaoming");
		user.setPassword("123456");
		Connection conn=null;
		try {
			conn=ConnectFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);
			ResultSet resultSet=userDao.get(conn,user);
			while(resultSet.next()){
				System.out.println("true");
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

	}
		
	}
	
	

