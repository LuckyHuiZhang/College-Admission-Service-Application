package bus;

public class PStudent extends Student
{
	private double firstFees;
	private double feesPerCredit;
	private double numberOfCreditsPerSession;
	
	public PStudent() 
	{
		super();
	}
	
	public PStudent(int id, String fn, String ln, String email) 
	{
		super(id, fn, ln, email);
	}
	
	
	public PStudent(int id, String fn, String ln, String email,double firstFees, double feesPerCredit, double numberOfCreditsPerSession) 
	{
		super();
		this.firstFees = firstFees;
		this.feesPerCredit = feesPerCredit;
		this.numberOfCreditsPerSession = numberOfCreditsPerSession;
	}

	public double getFirstFees() {
		return firstFees;
	}

	public void setFirstFees(double firstFees) {
		this.firstFees = firstFees;
	}

	public double getFeesPerCredit() {
		return feesPerCredit;
	}

	public void setFeesPerCredit(double feesPerCredit) {
		this.feesPerCredit = feesPerCredit;
	}

	public double getNumberOfCreditsPerSession() {
		return numberOfCreditsPerSession;
	}

	public void setNumberOfCreditsPerSession(double numberOfCreditsPerSession) {
		this.numberOfCreditsPerSession = numberOfCreditsPerSession;
	}

	@Override
	public String toString() {
		return "PStudent [firstFees=" + firstFees + ", feesPerCredit=" + feesPerCredit + ", numberOfCreditsPerSession="
				+ numberOfCreditsPerSession + "]";
	}
	
	public  double calculFees()
	{
		return this.firstFees+(this.feesPerCredit*this.numberOfCreditsPerSession);		
	}
	
	
	
	
	

}
