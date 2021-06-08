package w3school.abstruct_class_methods;

    //Abstract class
    abstract class Main{
        public String fname = "Jhon";
        public int age = 24;
        public abstract void study(); //abstruct method
    }

    //Subclass (inherit from Main)
    class Student extends Main {
        public int graduationYear = 2018;
        public void study() {
            System.out.println("Studying all day long");
        }
    }

        //End code from filename : Main.java



