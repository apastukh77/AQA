package w3school.abstruct_class_methods.abstruct_class_methods2;

abstract class Animal {

    public abstract void animalSound();//abstruct method does not have a body
    public void sleep() { // regular method
        System.out.println("Zzz");
    }
}

    class Pig extends Animal{ //subclass (inherit from Animal)
    public void animalSound(){
        System.out.println("The pig says: wee wee") ; //the body of animalSound()
        }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
