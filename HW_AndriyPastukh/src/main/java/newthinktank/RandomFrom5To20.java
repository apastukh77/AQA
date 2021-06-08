package newthinktank;

public class RandomFrom5To20 {

    public static void main(String[] args) {

        int minNum = 1;
        int maxNum = 20;
        int randNum = minNum + (int)(Math.random()*((maxNum - minNum)+1));
        System.out.println("Rand : " + randNum);

    }

}
