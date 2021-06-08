package logic.factoty_method;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;

/**
 * @author Serhiy Dubovenko
 */
public class Main {
    public static final String TEXT = "It's my file ";

    public static final String FILE_PATH = "D:\\QA_TEST\\MyFile_1.txt";
    public static final String MODE1 = "CONSOL";
    public static final String MODE2 = "BINARY";
    public static final String MODE3 = "TEXT";



    private static AbstractWriter createFile(String mode){
        switch (mode){
            case "CONSOL":{
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

        AbstractWriter  aWriter = createFile("TEXT");
        try {
            aWriter.writeText(TEXT, file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();
        gson.fromJson("", ConsoleWriter.class);
    }
}
