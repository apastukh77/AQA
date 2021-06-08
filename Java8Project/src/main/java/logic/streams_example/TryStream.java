package logic.streams_example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static logic.streams_example.TransmissionsType.AUTOMATIC;
import static logic.streams_example.TransmissionsType.MANUAL;

public class TryStream {


        private static void printArray(List<Car> listOfCars){
            listOfCars.forEach(x-> {
                System.out.println(x.getVendor()+" | "+x.getTransmission()+" |"+x.getModel()+" | "+x.getEngineV()+" | "+x.getMaxSpead()+" | "+x.getTimeTo100()+"; ");
            });
        }

    public static void main(String[] args) {

        List<Car> listOfCars = new ArrayList();
        listOfCars.add(new Car("Toyota", "Prius", 2.0, AUTOMATIC, 260, 8.8));
        listOfCars.add(new Car("Toyota", "RAV 4", 2.4, AUTOMATIC, 280, 7.6));
        listOfCars.add(new Car("BMV", "7", 3.5, AUTOMATIC, 320, 7.2));
        listOfCars.add(new Car("Daewoo", "Lanos", 1.6, MANUAL, 260, 5.0));
        listOfCars.add(new Car("Renault", "Megan", 2.0, AUTOMATIC, 260, 9.0));

        System.out.println("\n #################### INIT ARRAY ######################\n");
        printArray(listOfCars);
        System.out.println("\n#####################################################\n");

        /* Найти автомобили с объемом двигателя >=2.0*/
        List cars20 = new ArrayList();
        for (int i = 0; i <listOfCars.size() ; i++) {
            if(listOfCars.get(i).getEngineV()>=2.0){
                cars20.add(listOfCars.get(i));
            }
        }
        System.out.println("\n #################### CARS 2.0 java 7 ######################\n");
        printArray(cars20);
        System.out.println("\n############################################################\n");


        System.out.println("\n #################### CARS 2.0 java 8 ######################\n");
        printArray(listOfCars                       // коллекция
                .stream()                           // преобразование коллекции к объекту последовательного потока (стрима)
                .filter(o->o.getEngineV()>=2.0)     // фильтрация по условию o.getEngineV()>=2.0
                .collect(Collectors.toList()));     // формирование результируюей коллекции
        System.out.println("\n############################################################\n");

        /* Найти первый Renault Megan в коллекции */
       Car carMegan = listOfCars                       // коллекция
                .stream()                           // преобразование коллекции к объекту последовательного потока (стрима)
                .filter(o->o.getModel().equals("Megan"))     // фильтрация по условию o.getModel().equals("Megan")
                .findFirst()                         // выбор первого совпадения
               .get();                           // получение результата
                  
    }



}
