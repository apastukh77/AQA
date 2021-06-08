package logic.interface_example;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Serhiy Dubovenko
 */
public interface Exampleable extends Sectionable {

    void printToConsol(String text);
    void printToFile(String text) throws IOException;

    default void closeWindow() throws IOException {
        System.out.println("close Window");
    }
}
