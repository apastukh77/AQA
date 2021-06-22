package animal;

/**
 * Created by apastukh
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Marsel", 5);

        System.out.println(cat.name+" "+cat.age);

//        cat.setName("Marsel");
//        cat.setAge(5);
//        System.out.println(cat.getName()+" "+cat.getAge());
    }
}
