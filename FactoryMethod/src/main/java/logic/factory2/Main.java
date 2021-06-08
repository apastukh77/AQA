package logic.factory2;

import java.io.File;
import java.io.IOException;
/**
 * apastukh
 */
public class Main {
    public static final String TEXT = "It's my file";
    public static final String FILE_PATH ="F:\\JAVA\\AQA\\QA Test\\MyFile_1.txt";
    public static final String MODE1 ="CONSOLE";
    public static final String MODE2 ="BINARY";
    public static final String MODE3 ="TEXT";

    public static AbstractWriter createFile(String mode){
        switch (mode){
            case "CONSOLE":{
                return new ConsoleWriter();
            }
            case "BINARY":{
                return new TxtBinaryWriter();
            }
            case "TEXT":{
                return new TxtWriter();
            }
        }
        return new TxtBinaryWriter();
    }

    public static void main(String[] args) {
        File file = new File(FILE_PATH);

        AbstractWriter aWriter = createFile("BINARY");
        try {
            aWriter.writeText(TEXT, file);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
