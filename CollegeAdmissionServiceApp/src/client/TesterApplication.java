package client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;
import bus.*;
import data.*;

public class TesterApplication {

	public static void main(String[] args) 
	{
		DecimalFormat twoDec = new DecimalFormat("0.000");
		ArrayList<IPayableFees> myList = new ArrayList<IPayableFees>();	
		myList.add(new FStudent(1000, "hui" ,"zhang", "huizhang@gmail.com", 1000,7000));
		myList.add(new FStudent(1000, "mary" ,"chen", "marychen@gmail.com", 2000,6000));	
		myList.add(new PStudent(1000, "lucas" ,"qing", "lucasqing@gmail.com", 1000,10,7000));
		myList.add(new PStudent(1000, "jacky" ,"wang", "javkywang@gmail.com", 1000,10,7000));	
		for(IPayableFees element : myList)
		{
			System.out.println(element + "\n\t" 
		         + twoDec.format(element.calculFees()));			
		}

		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<FStudent> FStudentList = new ArrayList<FStudent>();
		ArrayList<PStudent> PStudentList = new ArrayList<PStudent>();

		FStudent aFStudent = new FStudent();
		PStudent aPStudent = new PStudent();
		Date date = new Date();
		
		 Scanner scan = new Scanner(System.in);
		    int choice = 0,id = 0;
		
		 do
		    {
		    	System.out.println("=====Welcome to Use My College Admission Service System======");
		    	System.out.println("\n<1>.Adding a New Student "
		    			+ "\n<2>.Deleting a Student"
		    			+ "\n<3>.Searching a Student"
						+ "\n<4>.Displaying Full Time Student"
						+ "\n<5>.Displaying Part Time Student"
						+ "\n<6>.Exit\n"
						+ "\nPlease Enter Your Choice: ");
				choice = scan.nextInt();
				String  AccountOption;
					    		
		    	switch(choice)
		    	{
		    	case 1:
		    		System.out.println("=========Adding Student=======");
		    		 System.out.print("Please choose the sector(FStudent,PStudent) : ");
		    		 AccountOption = scan.next();
		    		 
		    		 switch(AccountOption)
		    		 {
		    		 case "FStudent":
		    		    System.out.println("---Full Time Student Information---"); 	    		    
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
		        	    FStudentList.add( aFStudent);
		 	     	    System.out.println(FStudentList);
		    			break;
		    			 
		    		 case "PStudent":
		    		    System.out.println("---Part Time Student Information---"); 		    		    
		    		    System.out.print("Please input Id : ");
		    		    aPStudent.setId(scan.nextInt());
		        	    System.out.print("Please input first name : ");
		        	    aPStudent.setFn(scan.next());	 	     	    		 	     	 
		        	    System.out.print("Please input last name : ");
		        	    aPStudent.setLn(scan.next());
		        	    System.out.print("Please input email : ");
		        	    aFStudent.setEmail(scan.next());		
		        	    System.out.print("Please input first fees : ");
		        	    aPStudent.setFirstFees(scan.nextInt());		
		        	    System.out.print("Please input fees per credit : ");
		        	    aPStudent.setFeesPerCredit(scan.nextInt());		
		        	    System.out.print("Please input number Of credits per session : ");
		        	    aPStudent.setNumberOfCreditsPerSession(scan.nextInt());	
		        	    PStudentList.add(aPStudent);
			 	     	System.out.println(PStudentList);
			    	    break;
		    		 default:
		    		  	    System.out.println("\nPlease enter correct information !");
		    		 
		    		 }	    		
		    		break;
		    		
		    	case 2:
		    		System.out.println("=========Deleting Student=======");
		    		Student deleteFStudent = new FStudent();    	
		    		Student deletePStudent = new PStudent();  
		    		System.out.println("\nEnter Searching Student : ");
	    			int deleteId = scan.nextInt();
	    			Iterator<Student> del = studentList.iterator();		
					while (del.hasNext())
					{
						
						deleteFStudent = del.next();
					       if (deleteFStudent.getId() == deleteId) 
					       {
					       del.remove();
					       System.out.println("\nThe data has been deleted");
					       break;
					       }
					       else if(deletePStudent.getId() == deleteId)
					       {
					    	   del.remove();
						       System.out.println("\nThe data has been deleted");
						       break; 
					       }
					}	    		    			    		
		    		break;
		    		
		    	case 3:
		    		System.out.println("=========Searching Student=======");
		    		FStudent searchFStudent = new FStudent();
		    		PStudent searchPStudent = new PStudent();
		    	    			
		    			if( studentList.isEmpty()){
							System.out.println("The list is empty");
							break;
						}
		    			else
		    			{
		    				System.out.println("\nEnter Searching Account Number : ");
			    			int searchId = scan.nextInt();
		    		    	for(Student myStudent:  studentList)
		    		    	{
		    				    if(searchId ==  myStudent.getId())
		    				  {
		    					System.out.println(searchFStudent.toString());
		    					System.out.println(searchPStudent.toString());	    					
								break;
		    				   }
		    				else
		    				   {
		    					System.out.println("No found!");
								break;
		    				   }	    			
		    		        }
		    			}
		    		break;
		    		
                case 4:
                	Collections.sort(studentList, new SerialNumberPredicate());
					for(Student s : studentList)
					{
						System.out.println(s);
					}		    		
		    		System.out.println(FStudentList);
		    		break;
		    		
                case 5:
                	Collections.sort(studentList, new SerialNumberPredicate());
					for(Student s : studentList)
					{
						System.out.println(s);
					}		     		
		    		System.out.println(PStudentList);
		    		break;
		    		
		    	case 6:
		    		if( studentList.isEmpty())
		    		{
						System.out.println("The list is empty.");
						break;
					}
					System.out.println(studentList);
		    		break;
		    		
		    	default:
		    		    	
		    	}
		    	    	    	
		    }while(choice != 6);
		    {
		    	System.out.print("Thank for using.");
		    }
		  

	}

}
