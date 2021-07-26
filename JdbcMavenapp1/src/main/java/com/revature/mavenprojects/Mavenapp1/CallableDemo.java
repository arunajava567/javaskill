package com.revature.mavenprojects.Mavenapp1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
/*
 * 
 * DELIMITER $$
CREATE PROCEDURE getcandidateskillandname(IN candidate_id INT,IN name varchar(10) )
BEGIN
	SELECT id, first_name,last_name, skill  
	FROM candidates  WHERE id = candidate_id and first_name=name;
    
    END $$
DELIMITER ;
 */
public class CallableDemo {
	

	    public static void getSkills(int candidateId,String candidateName) throws Exception {
	        // 
	        String query = "{ call getcandidateskillandname(?,?) }";
	        ResultSet rs;

	       Connection conn = DBUtil.getConnection();
	        
	       CallableStatement cmt = conn.prepareCall(query);

	           cmt.setInt(1, candidateId);
	           cmt.setString(2, candidateName);
	            rs = cmt.executeQuery();
	            
	            while (rs.next()) {
	            	System.out.println("in callable with 2 param  ");
	            	System.out.println( rs.getString(1)	 + " "   + rs.getString(2) + " "   + rs.getString(3) + " "   + rs.getString(4));
	                        
	            	}
	        
	    }

	   
	    public static void main(String[] args)  throws Exception{
	    	System.out.println("callable demo");
	        getSkills(3,"anjan");
	    }
	}
