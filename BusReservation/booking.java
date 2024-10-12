package BusReservation;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class booking {
    String passengerName;
    int busNo;
    Date date;
    Scanner scanner = new Scanner(System.in);

    booking() {
        System.out.println("Enter name of passenger: ");
        passengerName = scanner.next();
        System.out.println("Enter Bus no: ");
        busNo = scanner.nextInt();
        System.out.println("Enter Date dd-mm-yyyy: ");
        String dateInput = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable() throws SQLException{
    	busDAO busdao = new busDAO();
    	bookingDAO bookingdao = new bookingDAO();
        int capacity = busdao.getCapacity(busNo);
        int booked = bookingdao.getBookedCount(busNo,date);        
        return booked < capacity;
    }
}
