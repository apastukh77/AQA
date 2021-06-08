package logic.factory2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class AbstractWriter {
    public abstract void writeText(String text, File file) throws IOException;
    public void rmFile(String path){

    }
}
