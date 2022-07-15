import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	private Statement stmt;
	private ResultSet rs;
	private Connection conn;
	private boolean loggedIn = false;
	
	private String firstname;
	private String lastname;
	private String location;
	private String city;
	
	PreparedStatement pst;
	
	
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Database(String username, String password) {
		
		try {
			this.conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/studetReg", username,password);
			this.stmt = conn.createStatement();
			this.loggedIn = true;
			this.rs = null;
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
	}
	public void selectall() throws SQLException {
		this.rs = this.stmt.executeQuery("SELECT * FROM student;");
		while(rs.next()) {
			System.out.println(rs.getString("first_name"));
		}
	}
	public boolean isLoggedIn() {
		return loggedIn;

	}
	
	
}	
	
