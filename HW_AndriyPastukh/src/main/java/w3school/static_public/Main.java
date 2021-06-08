package w3school.static_public;

public class Main {

    //Static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    //Public method
    public void MyPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }
    //Main method
    public static void main(String[] args) {
        myStaticMethod(); //Call the static method
        //MyPublicMethod(); This would output an error

        Main myObj = new Main(); //Create an new object of Main
        myObj.MyPublicMethod(); //Call the public method
    }

}
