package BusReservation;
import java.sql.*;

public class dbConnection {
	private static final String url = "jdbc:mysql://localhost:3306/busResv";
	private static final String userName = "root";
	private static final String pass ="2005";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url, userName, pass);
	}
}
