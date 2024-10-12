package BusReservation;

public class bus {
    private int busNo;
    private boolean ac;
    private int capacity;
    
    bus(int no, boolean ac, int cap){
        busNo = no;
        this.ac = ac;
        capacity = cap;
    }
    
    public int getCapacity() { // accessor method
        return capacity;
    }

    public void setCapacity(int cap) { // mutator method
        this.capacity = cap;
    }

    public int getBusNo() {
        return busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }
    

}
