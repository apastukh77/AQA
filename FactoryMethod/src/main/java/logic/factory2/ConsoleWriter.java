package logic.factory2;

import java.io.File;

public class ConsoleWriter extends AbstractWriter{
    @Override
    public void writeText(String text, File file) {
        System.out.println("ConsoleWriter");
        System.out.println(text);
    }
}
