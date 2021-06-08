package logic.jcf.entity;

public class Main {

    private Car getCar(String model, double engineV, String color,  int year){
        System.out.println("Start");
        Car hondaCRV = new Car( model, engineV, color, year );
        System.out.println(hondaCRV.toString());
        System.out.println("End");
        return hondaCRV;
    }

    private void printCar(String model, double engineV, String color,  int year){
        System.out.println("Start");
        Car hondaCRV = new Car( model, engineV, color, year );
        System.out.println(hondaCRV.toString());
        System.out.println("End");

    }

    public static void main(String[] args) {
        Car hondaCRV = new Car("Ford", 87.99, "Gold", 1987);
        hondaCRV.startEngine();
        hondaCRV.toDrive();

        Car lada = new Car("Kalina", 1.4, "White Night", 2008);
        Car chevrolet = new Car("Aveo", 1.8, "Black", 2004);
    }
}
