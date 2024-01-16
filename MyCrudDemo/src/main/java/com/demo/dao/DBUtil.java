package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection con;
	public static Connection getMyconnection()
	{
		if(con==null)
		{try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://192.168.10.150:3306/dac38?useSSL=false";
			
				con=DriverManager.getConnection(url,"dac38","welcome");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return con;
		
	}
	public static void closemyconnection()
	{
		try {
			if(con!=null)
			{
				con.close();
			}
			
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
