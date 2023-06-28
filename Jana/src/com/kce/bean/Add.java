package com.kce.bean;
import java.sql.*;
import java.util.List;

public class Add {
  static List<OrderedFood> order;
    public Add()
    {
    Main o=new Main();
    order=o.getList();
    }
   public void bill()
   {
	   try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123456");
			  PreparedStatement ps=con.prepareStatement("select * from Display");
			  ResultSet rs=ps.executeQuery();
			  int tot=0;
			  while(rs.next())
			  {
				  tot+=rs.getInt(3);
			  }
			  System.out.println("Total Amount : "+tot);
			  ps=con.prepareStatement("delete from Display");
			  ps.executeUpdate();
		  }
			  catch(Exception e)
			  {
				  System.out.println(e);
			  }
   }
  public void addToOrder() {
	  try {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123456");
	  PreparedStatement ps=con.prepareStatement("insert into Display values(?,?,?)");
	  for(int i=0;i<order.size();i++)
	  {
		  ps.setString(1,order.get(i).getPname());
		  ps.setInt(2,order.get(i).getQuantity());
		  PreparedStatement ps1=con.prepareStatement("select Price from Menu where ItemName=(?)");
		  ps1.setString(1,order.get(i).getPname());
		  ResultSet rr=ps1.executeQuery();
		  int temp=0;
		  while(rr.next())
		  {
			  temp=rr.getInt(1);
		  }
		  int pri=order.get(i).getQuantity()*temp;
		  ps.setInt(3,pri);
		  ps.executeUpdate();
	}
	
  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
  public void Display()
  {
	  try {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123456");
      PreparedStatement ps=con.prepareStatement("select * from Display");
      ResultSet rs=ps.executeQuery();
      while(rs.next())
      {
    	  System.out.println(rs.getString(1)+" "+rs.getInt(2));
      }		  
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  
   
}
}
