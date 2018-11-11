package pantallas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnection{

	  Connection con = null;
	  Statement stmt = null;
	  ResultSet rs = null;

	public DBConnection() {}

	public void connect() {
	    try {
	        Class.forName("net.sourceforge.jtds.jdbc.Driver");
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
