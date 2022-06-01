package com.itbaizhan.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DBConn {
	
	
	
	/*private static String url = "jdbc:jtds:sqlserver://127.0.0.1:1433;DatabaseName=shujuku_db";
	
	private static String username = "sa";
	
	private static String password = "123456";
	
	private static String jdbc = "net.sourceforge.jtds.jdbc.Driver";*/
	private static String url = "jdbc:mysql://39.108.192.148:3306/shujuku_db?characterEncoding=UTF-8";
	
	private static String username = "root";
	
	private static String password = "334d2804f5494809";
	
	private static String jdbc = "com.mysql.jdbc.Driver";
	
	
	
	
	/**
	 * 获得数据库的连接
	 * @return
	 */
	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName(jdbc);
			conn = DriverManager.getConnection
			(url,username,password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//关闭数据库的连接
	public static void close(Connection conn,PreparedStatement ps,ResultSet rs){
		if(rs!=null){
			try{
				rs.close();
			}catch(Exception e){
				
			}
		}
		
		if(ps!=null){
			try{
				ps.close();
			}catch(Exception e){
				
			}
		}
		
		if(conn!=null){
			try{
				conn.close();
			}catch(Exception e){
				
			}
		}
		
		
		
		
	}
	
	

	
}
