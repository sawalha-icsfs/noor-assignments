package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowAllStudent {
	public static void showAllStudent() {
	String selectQuery = "SELECT * FROM STUDENTS";
	
	try (Connection con = ConnectionClass.getConnection();
			PreparedStatement preparedStatement = con.prepareStatement(selectQuery); ResultSet rs = preparedStatement.executeQuery()) {
		while (rs.next()) {
			System.out.println("id: "    + "\t" +rs.getInt(1)     +  "\t" +
		                      "Name:" 	 + "\t" + rs.getString(2)  +  "\t \t" + 
		                      "Average:" +"\t" + rs.getInt(3)     +  " \t \t" +
		                      "Email:"    + "\t"+rs.getString(4) );
		}
		
		
	
		

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
