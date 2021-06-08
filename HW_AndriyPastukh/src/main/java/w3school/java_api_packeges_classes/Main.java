package w3school.java_api_packeges_classes;

import java.util.Scanner; //import the Scanner class from java.util package

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username : " );
        String userName = myObj.nextLine();
        System.out.println("User name is: " + userName);
    }
}