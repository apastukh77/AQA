package logic;

import logic.entity.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println(Student.ACADEMY);

        Student student = new Student();
        student.setName("Tom");
        student.setLastName("Cat");
        student.setGroupID(201);
        student.setAge(20);

        System.out.println(
                        "Name: " + student.getName() + ";"
                        + "Surname: " + student.getLastName() + ";"
                        + "Group: "+ student.getGroupID() + ";"
                        + "Age: " + student.getAge() + ";"
            );

        System.out.println(student.toString());

        Student student2 = new Student();
        student2.setName("Miki");
        student2.setLastName("Mouse");
        student2.setGroupID(202);
        student2.setAge(19);

        System.out.println(
                "Name: " + student2.getName() + ";"
                        + "Surname: " + student2.getLastName() + ";"
                        + "Group: " + student2.getGroupID() + ";"
                        + "Age: " + student2.getAge() + ";"
            );

        System.out.println(student2.toString());
        student2.printName();
        student2.printAge();

        Student [] mass = {
                new Student("Sergiy", "Dubovenko", 201, 21),
                new Student("Andriy", "Saenko", 201, 22),
                new Student("Mike", "Chose", 507, 21),
                new Student("Anatoliy", "Boyko", 301, 23),
        };
        System.out.println("Group");
        for (Student s : mass){
            System.out.println(s.toString());
        }
    }
}


