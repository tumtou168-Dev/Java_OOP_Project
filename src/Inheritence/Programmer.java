package Inheritence;

public class Programmer extends Employee{
    String programmingLanguage;

    public Programmer(){}

    public Programmer(String programmingLanguage){
       this.programmingLanguage = programmingLanguage;
    }
    public Programmer(String name , String address, String age, String experience, String programmingLanguage){
        super(name, address, age, experience);
        this.programmingLanguage = programmingLanguage;
    }
    public void writeCode(){
        System.out.println(name +" Programmer Write code");
    }
}
