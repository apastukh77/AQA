package education_online2;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        MyClass second_object = new MyClass();
        int resPow = second_object.pow(10);
        System.out.println("Result of squaring in the class named MyClass : " + resPow + ";");
        resPow = second_object.pow(3);
        System.out.println("Result of squaring in the class named MyClass : " + resPow + ";");

        System.out.println();
        int resPowl = second_object.powl(2, 2 );
        System.out.println("Result of squaring a^n in the class named MyClass : " + resPowl + ";");

        System.out.println();
        for (int i = 1; i <= 10 ; i++){
            int res = second_object.powl(i, 3);
            System.out.println("Result of loop squaring a^n in the class named MyClass : " + res + ";");
        }

        System.out.println();
        System.out.println("Exponent in the class named MyClass : " + second_object.getExp() + ";");

//----------------------------------------------------------------------------------------------------



    }
}
