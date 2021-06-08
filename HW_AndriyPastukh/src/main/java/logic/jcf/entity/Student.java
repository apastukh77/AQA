package logic.jcf.entity;

public class Student {

    private String name;
    private String lastName;
    private int groupId;
    private int age;

    public Student() {

    }

    public Student (String name, String lastName, int groupId, int age){
            this.name = name;
            this.lastName = lastName;
            this.groupId = groupId;
            this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;

    }
}
