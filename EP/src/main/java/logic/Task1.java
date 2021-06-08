package logic;

/**
 * @author Serhiy Dubovenko
 */
public class Task1 {

    public Double getText(){
        return null;
    }

    public double getInt(Double number){
        return number/6;
    }


    public static void main(String[] args) {
        System.out.println(new Task1().getInt(new Task1().getText()));
    }

}
