package com.revature.mavenprojects.Mavenapp1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Jdbcapp2 {





	public static void main(String[] args) {
	try(	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/revature","root","root"))
		{
	
	
	Statement st=con.createStatement();
		
	//partically, dbserver time,network traffic
	PreparedStatement pst=con.prepareStatement("insert into  fsdbatch01 values(?,?)");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 3 records...");
	for(int i=1;i<=3;i++) {
		int id= sc.nextInt(); sc.nextLine(); //clear the buffer
		String name=sc.nextLine();
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.execute();
		
	}
	
	ResultSet rs=st.executeQuery("select * from fsdbatch01 ");
	
	while(rs.next()) {
		
		System.out.println(rs.getString(1)+"  "+rs.getString(2));
	}
	System.out.println("rows created...");
		}
	catch(Exception e) {
		
	}
	
	
	}
}
