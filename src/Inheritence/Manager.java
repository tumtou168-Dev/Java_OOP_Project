package Inheritence;

public class Manager extends Employee{
    String teamSize;
    public Manager(){}

    public Manager(String teamSize){
        this.teamSize = teamSize;
    }
    public Manager(String name , String address, String age, String experience, String teamSize){
        super(name, address,age,experience);
        this.teamSize = teamSize;
    }

    public void report(){
        System.out.println("Manager is reporting.");
    }
}
