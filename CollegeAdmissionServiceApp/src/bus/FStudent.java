package bus;

import java.sql.SQLException;



public class FStudent extends Student
{
	private double firstFees;
	private double sessionFees;
	
	public  FStudent()
	{
		super();
	}

	public FStudent(int id, String fn, String ln, String email) 
	{
		super(id, fn, ln, email);
	}

	public FStudent(int id, String fn, String ln, String email, double firstFees, double sessionFees) 
	{
		super();
		this.firstFees = firstFees;
		this.sessionFees = sessionFees;
	}

	public double getFirstFees() {
		return firstFees;
	}

	public void setFirstFees(double firstFees) {
		this.firstFees = firstFees;
	}

	public double getSessionFees() {
		return sessionFees;
	}

	public void setSessionFees(double sessionFees) {
		this.sessionFees = sessionFees;
	}
	
	public static void addFStudent(FStudent aFStudent) throws SQLException 
    {
		     FStudent.addFStudent(aFStudent);;
	}
	public static void displayFStudent() throws SQLException
	{
			 FStudent.displayFStudent();
	}
	public static void deleteFStudent(FStudent aFStudent) throws SQLException 
	{
			 FStudent.deleteFStudent(aFStudent);
	}
	public static void searchFStudent(FStudent aFStudent) throws SQLException
	{
			 FStudent.searchFStudent(aFStudent);
	}
	public static void updateFStudent(FStudent aFStudent) throws SQLException 
	{
			 FStudent.updateFStudent(aFStudent);
	}

	@Override
	public String toString() {
		return "FStudent [firstFees=" + firstFees + ", sessionFees=" + sessionFees + "]";
	}
	
	public  double calculFees()
	{
		return this.firstFees + this.sessionFees;		
	}
	
	
	
	
	

}
