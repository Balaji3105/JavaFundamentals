package FundamentalsOfJava;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Human balaji = new Human();
        balaji.name="Balaji";
        balaji.age=26;
        balaji.sex="M";

        System.out.println(balaji.name+" is "+balaji.age+" years old.");
        balaji.eat();

        Human khajal = new Human();
        khajal.name="Khajal";
        khajal.sex="F";
        khajal.age=27;

        System.out.println(khajal.name+" is "+khajal.age+" years old.");
        khajal.sleep();
    }
}