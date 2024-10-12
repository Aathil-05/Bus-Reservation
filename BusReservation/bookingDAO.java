package BusReservation;
import java.sql.*;
import java.util.Date;

public class bookingDAO {
	public int getBookedCount(int busNo,Date date) throws SQLException{
		
		String query = "select count(passenger_name) from booking where bus_no = ? and travel_date = ?";
		Connection con = dbConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setInt(1, busNo);
		pst.setDate(2, sqldate);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	}
	
	public void addBooking(booking book) throws SQLException {
		
		String query = "insert into booking values(?,?,?)";
		Connection con = dbConnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, book.passengerName);
		pst.setInt(2, book.busNo);
		java.sql.Date sqldate = new java.sql.Date(book.date.getTime());
		pst.setDate(3, sqldate);
		
		pst.executeUpdate();
	}
}
