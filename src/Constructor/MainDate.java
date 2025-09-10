package Constructor;

public class MainDate {
    public static void main(String[] args) {
        Date date1 = new Date();
        date1.printDate();
        Date date2 = new Date(01,12,2004, "Khmer New Year");
        date2.printDate();
    }
}
