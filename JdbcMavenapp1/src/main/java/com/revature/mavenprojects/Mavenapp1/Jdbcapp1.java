package com.revature.mavenprojects.Mavenapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcapp1 {

	public static void main(String[] args) throws Exception{
	//1	
	//Class.forName("com.mysql.cj.jdbc.Driver");  //register driver

		//  creating connection
		Connection con=DBUtil.getConnection();
		
	//3 statement creation
	
	Statement st=con.createStatement();
	//st.executeUpdate()    insert,delete,update,cretae,alter,drop,truncate
	//st.excute()      //select,"
	//st.executeQuery()   //select
	//st.executeUpdate("create table fsdbatch01(id int primary key,name varchar(20))");
	
	st.executeUpdate("insert into  fsdbatch01 values(8,'Anjan')");
	st.executeUpdate("insert into  fsdbatch01 values(8,'Anjan')");
	st.executeUpdate("insert into  fsdbatch01 values(8,'Anjan')");
	
	//st.executeUpdate("insert into  fsdbatch01 values(2,'Anjan')");

	//st.executeUpdate("update fsdbatch01 set name='shiny' where id=3");

	//st.executeUpdate("delete from fsdbatch01 where id=2");
	
	ResultSet rs=st.executeQuery("select * from fsdbatch01");
	
	while(rs.next()) {
		
		System.out.println(rs.getString(1)+"  "+rs.getString(2));
	}
	System.out.println("rows created...");
	}
}
