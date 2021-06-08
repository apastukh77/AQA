package logic.interface_example;

import java.io.IOException;

/**
 * @author Serhiy Dubovenko
 */
public class WriterChild extends Writer implements Exampleable {

    public static void main(String[] args) {

        try {
            new WriterChild().printToFile("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void printToConsol(String text) {

    }
}
