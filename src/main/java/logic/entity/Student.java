package logic.entity;

public class Student {

    public static final String ACADEMY = "Geeks For Less QA";

    private String name;
    private String lastName;
    private int groupID;
    private int age;

    public Student() {
    }

    public Student(String name, String lastName, int groupID, int age) {
        this.name = name;
        this.lastName = lastName;
        this.groupID = groupID;
        this.age = age;
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

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupID=" + groupID +
                ", age=" + age +
                '}';
    }

    public void printName(){
        System.out.println("Name: " + this.name);
    };

    public void printAge(){
        System.out.println("Age: " + this.age);
    };
}
