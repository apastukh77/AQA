package logic.factoty_method;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Serhiy Dubovenko
 */
public abstract class AbstractWriter {



    public abstract void writeText(String text, File file) throws IOException;

    public void rmFile(String path){

    }
}
