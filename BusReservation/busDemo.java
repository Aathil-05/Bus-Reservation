package BusReservation;
import java.util.*;

public class busDemo {
    public static void main(String[] args) {
    	
    	busDAO busdao = new busDAO();
    	
    	try {
    	busdao.displayBusInfo();
        
        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);

        while (userOpt == 1) {
            System.out.println("Enter 1 to Book and 2 to Exit: ");
            userOpt = scanner.nextInt();
            if (userOpt == 1) {
                booking book = new booking();
                if (book.isAvailable()) {
                    bookingDAO bookingdao = new bookingDAO();
                    bookingdao.addBooking(book);
                    System.out.println("Your booking is confirmed");
                } else {
                    System.out.println("Bus is full. Try another bus or date");
                }
            }
        }

        scanner.close();
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    }
}
