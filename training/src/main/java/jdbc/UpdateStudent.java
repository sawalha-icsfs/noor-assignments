package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateStudent {

	
	/*public static void updateCurrentStudent (int id) {
		Student student = new Student();
		System.out.println("Please Enter Studet New Name :");
		student.setName(scanner.nextLine());
		
		System.out.println("Please Enter Studen New Averge :");
		student.setAverge(scanner.nextInt());
		
		System.out.println("Please Enter Studen New Email :");
		student.setEmail(scanner.next());
		
		String insertQuery = "UPDATE  STUDENTS SET NAME =? , AVERAGE =? , EMAIL=? WHERE ID = ?";
		try (Connection con = ConnectionClass.getConnection();
				PreparedStatement preparedStatement = con.prepareStatement(insertQuery)) {
		
			preparedStatement.setString(1, student.getName());
			preparedStatement.setInt(2, student.getAverge());
			preparedStatement.setString(3, student.getEmail());
			preparedStatement.setInt(4,  id);
			preparedStatement.executeUpdate();
			System.out.println("A new student has been updated");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	
	public static void updateCurrentStudent() {
		 Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Student ID :");
		Student studentInfo = new Student();
		studentInfo =StudentValidate.foundStudentById(scanner.nextInt());
		if (studentInfo!=null){
			System.out.println("Studen Exist And It Contain This Information ");
			System.out.println("ID :" + "	"+(studentInfo.getId()) );
			System.out.println("Name :" +"	"+(studentInfo.getName()) );
			System.out.println("Averge :" +"	"+(studentInfo.getAverge()) );
			System.out.println("Email :" +"	"+(studentInfo.getEmail()) );
			System.out.println("Please Reinput Student Information For Updated");
			Student student = new Student();
			
			
		
			System.out.println("Please Enter Studet New Name :");
			String name = scanner.next() ;
			student.setName(name);
			System.out.println("Please Enter Studen New Email :");
			String email = scanner.next();
			student.setEmail(email);
			
			System.out.println("Please Enter Studen New Averge :");
			int average = scanner.nextInt();
			student.setAverge(average);
			
			
			
			String insertQuery = "UPDATE  STUDENTS SET NAME =? , AVERAGE =? , EMAIL=? WHERE ID = ?";
			try (Connection con = ConnectionClass.getConnection();
					PreparedStatement preparedStatement = con.prepareStatement(insertQuery)) {
			
				preparedStatement.setString(1, student.getName());
				preparedStatement.setInt(2, student.getAverge());
				preparedStatement.setString(3, student.getEmail());
				preparedStatement.setInt(4,  studentInfo.getId());
				preparedStatement.executeUpdate();
				System.out.println("A new student has been updated");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else 
		{	System.out.println("Student Does Not Exist");
			
			
		}
			
		
	}
	

}
