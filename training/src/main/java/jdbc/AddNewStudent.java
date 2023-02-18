package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddNewStudent {
	static Scanner scanner = new Scanner(System.in);
	

	public static void insertIntoStudents() {
		Student student = new Student();
		System.out.println("Please Enter Studen ID :");
		student.setId(scanner.nextInt());
		if (StudentValidate.foundStudentById(student.getId()) !=null)
			System.out.println("Student is Exist");
		else
		
		System.out.println("Please Enter Studen Name :");
		student.setName(scanner.next());
		
		System.out.println("Please Enter Studen Averge :");
		student.setAverge(scanner.nextInt());
		
		System.out.println("Please Enter Studen Email :");
		student.setEmail(scanner.next());
		
		
		String insertQuery = "INSERT INTO STUDENTS(ID, NAME , AVERAGE , EMAIL) VALUES (?,?,?,?)";
		try (Connection con = ConnectionClass.getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(insertQuery)) {
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setInt(3, student.getAverge());
			preparedStatement.setString(4, student.getEmail());
			preparedStatement.executeUpdate();
			System.out.println("A new student has been inserted");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
