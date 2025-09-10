package Constructor;

public class Date {
    private int day;
    private int month;
    private int year;
    private String dateName;
    // Default constructor
    public Date(){
        day = 01;
        month = 01;
        year = 2025;
    }

    // Parameterized constructor
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Date(int day, int month, int year, String dateName){
        this(day,month,year);
        this.dateName = dateName; // Constructor in Constructor
    }

    public void printDate(){
        System.out.println("Date: " + day + "/" + month + "/" + year + "/" +(dateName != null ? dateName : ""));
    }
}
