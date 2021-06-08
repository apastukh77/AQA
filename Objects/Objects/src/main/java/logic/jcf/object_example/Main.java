package logic.jcf.object_example;

import logic.jcf.entity.Car;

/**
 * @author Serhiy Dubovenko
 */
public class Main {

    private Car getCar(String model, double engineV, String color, int year){
        System.out.println("Start");
        Car hondaCRV = new Car(model, engineV, color, year);
        System.out.println(hondaCRV.toString());
        System.out.println("End");
        return hondaCRV;

    }

    private void printCar( String model, double engineV, String color, int year){
        System.out.println("Start");
        Car hondaCRV = new Car(model, engineV, color, year);
        System.out.println(hondaCRV.toString());
        System.out.println("End");
    }

    private String printText(String text){
      if((text.length()>0)){
        return "str1";
      }else if (text.length()<0){
          return "str2";
      }else {
          System.out.println("test");
      }
        return "str2";

    }

    //перегруженные методы

    // print String int
     private void print(String str, int i){};

    // print String int
    // private void print(String str1, int i1){};

    // print String int
    // private void print(String text, int iterator){};

    // print int String
    private void print(int i, String str ){};




    public static void main(String[] args){

        Car hondaCRV = new Car("CRV", 2.5, "White", 2008);
        hondaCRV.startEngine();
        hondaCRV.toDrive();


        Car lada = new Car("Kalina", 1.4, "White Night", 2008);
        Car chevrolet = new Car("Aveo", 1.8, "Black", 2004);



    }

}
