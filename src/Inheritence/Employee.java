package Inheritence;

public class Employee {
    String name;
    String address;
    String age;
    String experience;
    public Employee(){
        name = "Unknown";
        address = "Unknown";
        age = "Unknown";
        experience = "Unknown";
    }

    public Employee(String name, String address, String age, String experience) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}
