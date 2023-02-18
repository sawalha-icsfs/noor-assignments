package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionClass {
	
	public static Connection getConnection() throws SQLException {
		Properties pro = new Properties();
		String fileName = "src/main/resources/db.properties";
		try (FileInputStream in = new FileInputStream(fileName)) {
			pro.load(in);
		} catch (IOException ex) {
			Logger lgr = Logger.getLogger(ConnectionClass.class.getName());
			lgr.log(Level.SEVERE, ex.getMessage(), ex);
		}

		String url = pro.getProperty("db.url");
		String user = pro.getProperty("db.user");
		String password = pro.getProperty("db.password");
		return DriverManager.getConnection(url, user, password);

	} }
