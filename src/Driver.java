import java.sql.*;
public class Driver {

	public static void main(String[] args) {
		try 
		{
			
			//1. Get Connection to DB
			
			Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/TutorLog_database", "root", "Password1");
			
			//2. Create a Statement
			
			Statement mystate = myCon.createStatement();
			
			//3. Execute SQL query
			
			ResultSet rs = mystate.executeQuery("select * from Students");
			
			//4. Process the results.	
			while (rs.next()) {
				System.out.println(rs.getString("studentID") + "," + rs.getString("firstname"));
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
