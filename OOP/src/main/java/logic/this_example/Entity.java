package logic.this_example;

/**
 * @author Serhiy Dubovenko
 */
public class Entity {

    private int number;
    private String text;
    private char sign;

    public Entity() {
    }

    public Entity(int number, String text, char sign) {
        this.number = number;
        this.text = text;
        this.sign = sign;
    }

    private  void print(){
        System.out.println("text");
    }

    void test(){
        this.print();
    }

    public static void main(String[] args) {

        Entity e = new Entity();
        e.test();
    }




}
