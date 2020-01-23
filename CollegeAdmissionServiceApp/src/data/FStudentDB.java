package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

import bus.College;
import bus.FStudent;;



public class FStudentDB 
{
	public static void addFStudent(FStudent aFStudent) throws SQLException
	{
		
		    Connection myDbInstance = ConnectDB.getConnectionDB( "system","123","localhost");
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Please input Id : ");
	        aFStudent.setId(scan.nextInt());
    	    System.out.print("Please input first name : ");
    	    aFStudent.setFn(scan.next());	 	     	    		 	     	 
    	    System.out.print("Please input last name : ");
    	    aFStudent.setLn(scan.next());
    	    System.out.print("Please input email : ");
    	    aFStudent.setEmail(scan.next());		
    	    System.out.print("Please input first fees : ");
    	    aFStudent.setFirstFees(scan.nextInt());		
    	    System.out.print("Please input session fees : ");
    	    aFStudent.setSessionFees(scan.nextInt());	
    	    String sqlStmt = "insert into bike values (?, ?, ?, ?, ?, ?)";
    	    PreparedStatement myPreparedStatement = myDbInstance.prepareStatement(sqlStmt);
	        myPreparedStatement.setLong(1, aFStudent.getId());
	        myPreparedStatement.setString(2, aFStudent.getFn());
	        myPreparedStatement.setString(3, aFStudent.getLn());
	        myPreparedStatement.setString(4, aFStudent.getEmail());
	        myPreparedStatement.setDouble(5, aFStudent.getFirstFees());
	        myPreparedStatement.setDouble(6, aFStudent.getSessionFees());
	        myPreparedStatement.executeUpdate();
	        myDbInstance.commit();    	  
	}
	
	 public static void displayFStudent() throws SQLException
	 {
	        Connection myDbInstance = ConnectDB.getConnectionDB( "system","123","localhost");
	        String sqlStmt = "select * from student";
	        Statement myStatement = myDbInstance.createStatement();
	        ResultSet myResult = myStatement.executeQuery(sqlStmt);
	        String id, fn, ln, email,firstFees,sessionFees;
	        while(myResult.next())
	        {	           	            
	        	id =  myResult.getString(1);
	        	fn = myResult.getString(2);
	        	ln= myResult.getString(3);
	        	email = myResult.getString(4);          
	        	firstFees = myResult.getString(5);
	        	sessionFees = myResult.getString(5);	            
	            System.out.println(id + "|" + fn + "|" + ln  + "|" + email  + "|" + firstFees  + "|" + sessionFees);
	        }
	        
	 }
	 
	 public static void deleteFStudent(FStudent aFStudent) throws SQLException
     {
	        Connection myDbInstance = ConnectDB.getConnectionDB( "system","123","localhost");
	        System.out.println("input Id: ");
	        Scanner scan = new Scanner(System.in);
	        int id = 0;
	        id = scan.nextInt();
	        String sqlStmt ="delete from student where id = " + id;
	        PreparedStatement myPreparedStatement = myDbInstance.prepareStatement(sqlStmt);
	        myPreparedStatement.executeUpdate();
	        myDbInstance.commit();
	  }
	 
	 public static void searchFStudent(FStudent aFStudent) throws SQLException
	 {
	        Connection myDbInstance = ConnectDB.getConnectionDB( "system","123","localhost");
	        System.out.println("input id: ");
	        Scanner scan = new Scanner(System.in);
	        int s_id = scan.nextInt();
	        String sqlStmt = "select * from bike where serialNumber =" + s_id;
	        Statement myStatement = myDbInstance.createStatement();
	        ResultSet myResult= myStatement.executeQuery(sqlStmt);
	        String id, fn, ln, email,firstFees,sessionFees;	        
	        while(myResult.next())
	        {
	        	id =  myResult.getString(1);
	        	fn = myResult.getString(2);
	        	ln= myResult.getString(3);
	        	email = myResult.getString(4);          
	        	firstFees = myResult.getString(5);
	        	sessionFees = myResult.getString(5);	            
	            System.out.println(id + "|" + fn + "|" + ln  + "|" + email  + "|" + firstFees  + "|" + sessionFees);
	        }
	    }
	 
	  public static  void updateFStudent(FStudent aFStudent) throws SQLException
	  {
	        Connection myDbInstance = ConnectDB.getConnectionDB( "system","123","localhost");
	        Scanner scan = new Scanner(System.in);
	        System.out.println("input Id: ");
	        long s_id = scan.nextInt();
    	    System.out.print("Please input first name : ");
    	    aFStudent.setFn(scan.next());	 	     	    		 	     	 
    	    System.out.print("Please input last name : ");
    	    aFStudent.setLn(scan.next());
    	    System.out.print("Please input email : ");
    	    aFStudent.setEmail(scan.next());		
    	    System.out.print("Please input first fees : ");
    	    aFStudent.setFirstFees(scan.nextInt());		
    	    System.out.print("Please input session fees : ");
    	    aFStudent.setSessionFees(scan.nextInt());        
	        String sqlStmt = "update bike set id = ? , fn = ?, ln = ?, email = ?, firstFees = ?, sessionFees = ? where serialNumber =" + s_id;
	        PreparedStatement myPreparedStatement=myDbInstance.prepareStatement(sqlStmt);
	        myPreparedStatement.setLong(1,s_id);
	        myPreparedStatement.setString(2, aFStudent.getFn());
	        myPreparedStatement.setString(3, aFStudent.getLn());
	        myPreparedStatement.setString(4, aFStudent.getEmail());
	        myPreparedStatement.setDouble(5, aFStudent.getFirstFees());
	        myPreparedStatement.setDouble(6, aFStudent.getSessionFees());   
	        //Statement myStatement = myConnection.createStatement();
	        myPreparedStatement.executeUpdate();
	        myDbInstance.commit();
	    }

	
	 
	 

}
