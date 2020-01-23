package bus;

public abstract class Student implements IPayableFees
{
	private int id;
	private String fn;
	private String ln;
	private String email;
	
	public Student()
	{
		this.id=0;
		this.fn="";
		this.ln="";
		this.email="";
	}

	public Student(int id, String fn, String ln, String email)
	{
		super();
		this.id = id;
		this.fn = fn;
		this.ln = ln;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fn=" + fn + ", ln=" + ln + ", email=" + email + "]";
	}
		

}
