package com.dbconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FirstExample {

	public static void main(String[] args)  throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/";
		String dbname="world";
		String DBdriver="com.mysql.jdbc.Driver";
		String Username="root";
		String pwd="v$vek@nand90";
		Class.forName(DBdriver).newInstance();
		conn=DriverManager.getConnection(url+dbname, Username, pwd);
		PreparedStatement psmt=conn.prepareStatement("Select * from Register");
		ResultSet rs=psmt.executeQuery();
		
		while(rs.next())
		{
			for(int i=1;i<=5;i++)
				
			{
				System.out.println(rs.getString(i)+ "");
				
			}
			System.out.println();
		}
		

	}
}
