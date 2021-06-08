package logic.jcf.entity;

public class Car {

    private String model;
    private double engineV;
    private String color;
    private int year;

    public Car() {

    }

    public Car(String model, double engineV, String color, int year) {
        this.model = model;
        this.engineV = engineV;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineV() {
        return this.engineV;
    }

    public void setEngineV(double engineV) {
        this.engineV = engineV;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + ", engineV=" + engineV +
                ", color='" + color + '\'' + ", year=" + year + '}';
    }


    public void  toDrive(){System.out.println("wzhzzzz");}

    public void startEngine(){System.out.println("VVV---vvv");}
}
