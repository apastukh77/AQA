package logic.jcf.entity;

/**
 * @author Serhiy Dubovenko
 */
public class Car {

 StringBuilder bf;
    StringBuffer bl;

    public static String TEXT = "TEXT";

    private String model;
    private double engineV;
    private String color;
    private int year;

    public Car() {
    }

    public Car(String model, double engineV, String color) {
        this.model = model;
        this.engineV = engineV;
        this.color = color;
    }

    public Car(String model, double engineV, int year, String color) {
        this.model = color;
        this.engineV = engineV;
        this.color = model;
        this.year = year;
    }

    public Car(String model, double engineV, String color, int year) {
        this.model = model;
        this.engineV = engineV;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineV() {
        return engineV;
    }

    public void setEngineV(double engineV) {
        this.engineV = engineV;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engineV=" + engineV +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public void toDrive(){
        System.out.println("Wzvzvvvzvvvzzzzzzzzzzzzvvvzvvvzvz");
    }

    public void startEngine(){
        int year = 5;
        System.out.println("Vvvv--vvvv--vvvv-vvvv");
    }


}
