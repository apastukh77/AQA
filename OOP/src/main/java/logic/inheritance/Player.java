package logic.inheritance;

import java.util.List;

/**
 * @author Serhiy Dubovenko
 */
public class Player {

    private String name;
    private String lastName;
    private int yearOfBorn;
    private String nation;
    private List<String> listOfPosition;
    private int number;
    private int numberOfStars;
    private boolean isStar;
    private Double salary;

    public Player(String name, String lastName, int yearOfBorn, String nation, List<String> listOfPosition, int number, int numberOfStars, boolean isStar, Double salary) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfBorn = yearOfBorn;
        this.nation = nation;
        this.listOfPosition = listOfPosition;
        this.number = number;
        this.numberOfStars = numberOfStars;
        this.isStar = isStar;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBorn() {
        return yearOfBorn;
    }

    public void setYearOfBorn(int yearOfBorn) {
        this.yearOfBorn = yearOfBorn;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public List<String> getListOfPosition() {
        return listOfPosition;
    }

    public void setListOfPosition(List<String> listOfPosition) {
        this.listOfPosition = listOfPosition;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public boolean isStar() {
        return isStar;
    }

    public void setStar(boolean star) {
        isStar = star;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
