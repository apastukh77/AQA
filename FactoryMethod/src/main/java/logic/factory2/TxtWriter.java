package logic.factory2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TxtWriter extends AbstractWriter{
    @Override
    public void writeText(String text, File file) throws IOException {
        System.out.println("TxtWriter");
        Writer writer = new FileWriter(file);
        writer.write(text);
        writer.flush();
        writer.close();
    }
}
