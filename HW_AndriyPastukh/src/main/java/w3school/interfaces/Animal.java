package w3school.interfaces;

interface Animal {
    public void animalSound();//interface method does not have a body
    public void sleep() ; // interface method does not have a body
}

class Pig implements Animal { //subclass (inherit from Animal)
    public void animalSound(){
        System.out.println("The pig says: wee wee") ; //the body of animalSound()
    }

       public void sleep() {
           System.out.println("Zzz") ;
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
