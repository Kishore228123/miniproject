package com.kce.bean;
import java.sql.*;
import  java.io.*;
public class MenuCard{
	public static void Display()
	{
    try {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123456");
       Statement stm=con.createStatement();
       ResultSet rs=stm.executeQuery("Select * from menu1");
       int col=1;
       System.out.printf("%-20s %-20s %-20s\n","PId","PName","Price");
       System.out.println();
       while(rs.next())
       {
    	   System.out.printf("%-20s %-20s %-20s\n",col,rs.getString(1),rs.getInt(2));
       col++;
       }
    }catch(Exception e)
    {
    	e.printStackTrace();
    }
	}
}


