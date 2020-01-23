package bus;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class FileHandler 
{
	public static void writeProductToFile(ArrayList<Student> studentList) throws IOException
	{
		try {
			FileOutputStream fos = new FileOutputStream("products.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);		
			oos.writeObject(studentList);
			System.out.println("\n .....Product Inventory Data Successfully Saved into File.....");
			} catch(Exception e) {
				System.out.println(".....Save to File Unsuccessfully.....");
			}
	}
	
	@SuppressWarnings("unchecked")
	public static ArrayList<Student> readProductFromFile() throws IOException, ClassNotFoundException
	{
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		FileInputStream fis = new FileInputStream("student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		studentList = (ArrayList<Student>) ois.readObject();
		System.out.println("\n .....Student Data from File.....");
		for(Student record : studentList)
		{
			System.out.println("-----------------------------------------");
			System.out.println(record);			
		}
		return studentList;
	}
	
		

}
