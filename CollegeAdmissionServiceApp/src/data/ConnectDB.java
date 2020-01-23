package data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectDB 
{
	 private static Connection myConnection = null;
	  
	  public static Connection getConnectionDB( String userName, String password, String service) throws SQLException 
	  {
	        String url = "jdbc:oracle:thin:";
	        myConnection = DriverManager.getConnection(url + userName + "/" + password + "@" + service);
	        return myConnection;
	    }

}
