package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteStudent {
	static Scanner scanner = new Scanner(System.in);
	public static void deleteCurrentStuden(int id) {
		String insertQuery = "DELETE from STUDENTS WHERE ID = ?";
		try (Connection con = ConnectionClass.getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(insertQuery)) {
		
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			System.out.println("The Student Has Be Deleted");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void deleteStudent() {
		System.out.println("Please Enter Student ID :");
		Student studentInfo = new Student();
		studentInfo =StudentValidate.foundStudentById(scanner.nextInt());
		if (studentInfo!=null){
			System.out.println("Studen Exist And It Contain This Information ");
			System.out.println("ID :" + "	"+(studentInfo.getId()) );
			System.out.println("Name :" +"	"+(studentInfo.getName()) );
			System.out.println("Averge :" +"	"+(studentInfo.getAverge()) );
			System.out.println("Email :" +"	"+(studentInfo.getEmail()) );
			System.out.println("For Delete Student Please Write 3 ");
			if (scanner.nextInt()==3)
			deleteCurrentStuden(studentInfo.getId());
			
			
		}
		else 
		{	System.out.println("Student Does Not Exist");
			
			
		}
			
		
	}
	}


