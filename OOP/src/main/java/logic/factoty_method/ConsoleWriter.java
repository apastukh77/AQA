package logic.factoty_method;

import java.io.File;

/**
 * @author Serhiy Dubovenko
 */
public class ConsoleWriter extends AbstractWriter {

    @Override
    public void writeText(String text, File file) {
        System.out.println("ConsoleWriter");
        System.out.println(text);
    }
}
