package jdbc;

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

public class Task {
	


	public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

		System.out.println("For Add New Student   Please Write Number #1");
		System.out.println("For Update Student    Please Write Number #2");
		System.out.println("For Delete Student    Please Write Number #3");
		System.out.println("For Show All Students Please Write Number #4");
		System.out.println("For rquite            Please Write Number #5");

		switch (scanner.nextInt()) {

		case 1:
			AddNewStudent.insertIntoStudents();

			break;
		case 2:
			UpdateStudent.updateCurrentStudent();

			break;
		case 3:
			DeleteStudent.deleteStudent();

			break;
		case 4:
			ShowAllStudent.showAllStudent();
			

			break;
		case 5:
			quite ();
			

			break;

		}

	}
	public static void quite () {
		 Scanner scanner = new Scanner(System.in);
		System.out.println("GoodBye :)");
		scanner.close();
		
	}

}
