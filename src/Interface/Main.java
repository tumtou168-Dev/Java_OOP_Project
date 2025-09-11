package Interface;

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        Penguin penguin = new Penguin();

        parrot.eat();
        parrot.fly();

        penguin.eat();
        penguin.walk();
    }
}
