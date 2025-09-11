package Abstraction;

public class Main {
    public static void main(String[] args) {
//        Sok sok = new Sok();
//        Chan chan = new Chan();
        // We can replace keyword Sok and Chan to People
        People sok = new Sok();
        People chan = new Chan();


        sok.walk();
        chan.walk();

        sok.sing();
        chan.sing();
    }
}
