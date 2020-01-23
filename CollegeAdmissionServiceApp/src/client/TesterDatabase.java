package client;

import java.sql.Connection;
import java.util.Scanner;
import data.ConnectDB;
import java.sql.SQLException;
import bus.FStudent;


public class TesterDatabase 
{

	public static void main(String[] args) throws SQLException
	{
		Connection myConnection = ConnectDB.getConnectionDB("system","123","localhost");
	    System.out.println("Connection is Established");
	    int choice =0;
	    FStudent  aFStudent = new FStudent();
	    String name="";
	    Scanner scan = new Scanner(System.in);
	    do{
	        System.out.println("\n\n1. Adding a new full time student \n2. Displaying all full time student \n3. Delete a full time student \n4. Searching a full time student" +
	                "\n5. Updating a full time student\n6. Exit\n\nPlease enter your choice: ");
	        choice =scan.nextInt();
	        switch (choice){
	            case 1:
	            	 FStudent.addFStudent(aFStudent);
	                break;
	            case 2:
	            	 FStudent.displayFStudent();
	                break;
	            case 3:
	            	 FStudent.deleteFStudent(aFStudent);
	                break;
	            case 4:
	            	 FStudent.searchFStudent(aFStudent);
	                break;
	            case 5:
	            	 FStudent.updateFStudent(aFStudent);
	                break;
	            case 6:
	                break;
	            default:System.out.println("Please enter 1, 2, 3, 4, 5, or 6");

	        }

	    }while (choice !=6);


	}

}
