package w3school.abstruct_class_methods;

class Second {
    public static void main(String[] args) {
        Student myObj = new Student();

        System.out.println("Name - "+ myObj.fname);
        System.out.println("Age - "+ myObj.age);
        System.out.println("Graduation Year - "+ myObj.graduationYear);
        myObj.study(); //call abstract method
    }
}
