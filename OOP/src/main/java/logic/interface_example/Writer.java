package logic.interface_example;

import java.io.IOException;

/**
 * @author Serhiy Dubovenko
 */
public abstract class Writer implements Exampleable {

    private int test;

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }


    @Override
    public  abstract void printToConsol(String text);

    @Override
    public void printToFile(String text) throws IOException {
        System.out.println("text to file");

    }
}
