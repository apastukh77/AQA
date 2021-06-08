package w3school;

public class Person2 {
    String fname = "Andriy";
    String lname = "Pastukh";
    String email = "andriy.pastukh77@gmail.com";
    int age = 43;

    public static void main(String[] args) {
        Person myObj = new Person();

        System.out.println("Full name: " + myObj.fname + myObj.lname +";");
        System.out.println("Email: " + myObj.email +";");
        System.out.println("Age: " + myObj.age +".");

    }
}