package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentValidate {
	

	public static Student foundStudentById(int id) {
		Student student = null;
		String insertQuery = "Select * from students where id = ?";
		try (Connection con = ConnectionClass.getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(insertQuery);) {
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
		
			if (rs.next())
				student =  new Student(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4));

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;

	}

}
