package com.kce.bean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class Main {
 public static void main(String args[])
 {
	 MenuCard.Display();
	 Add a=new Add();
	 a.addToOrder();
	 a.Display();
	 a.bill();
 }
 public List<OrderedFood> getList(){
	 System.out.println("Enter the customer name");
	 Scanner sc=new Scanner(System.in);
	 String name=sc.nextLine();
	 System.out.println("Enter  0 to end the Order or 1-11");
	String num=sc.nextLine();
	Map<String,Integer> m=new LinkedHashMap<>();
	String fn="";
	int q;
	 while(!num.equals("0"))
	 {
		 switch(num)
		 {
		 case "1":
			  fn="milk";
			 System.out.println("Enter the quantity for "+fn);
			  q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "2":
			 fn="Bread";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "3":
			 fn="1kg rice";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "4":
			 fn="water bottle";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "5":
			 fn="1kg wheat";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "6":
			 fn="500g chasew";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "7":
			 fn="500g almonds";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "8":
			 fn="500g dry grapes";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "9":
			 fn="paper";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "10":
			 fn="box";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 case "11":
			 fn="maggie";
			 System.out.println("Enter the quantity for "+fn);
			 q=sc.nextInt();
			 m.put(fn,q);
			 break;
		 default:
			 try {
			throw new MissingException();
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
			}
		 System.out.println("Enter the 0 to end the Order or 1-11 to continue");
		 sc.nextLine();
         num=sc.nextLine();
	}
	 System.out.println("Name of the customer is : "+name);
	 ArrayList<OrderedFood>al=new ArrayList<>();
	for(Map.Entry<String,Integer> entry:m.entrySet())
	 {
		 al.add(new OrderedFood(entry.getKey(),entry.getValue()));
	 }
	return al;
 }
		 

}
