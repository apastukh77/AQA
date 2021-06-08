package logic.try_with_params;

import logic.create_exception.MyException;
import logic.using_exeptions.Modes;

import java.io.*;

/**
 * @author Serhiy Dubovenko
 */
public class Main {
    private static final String MODE = "HTML";
    private static final String TEXT = "My text";
    public static final String PATH1 = "D:\\Lab1\\Text1.txt";
    public static final String PATH2 = "D:\\Lab1\\Text2.html";

    protected void writeToTxtFile(String text, File file){


        try(OutputStream os = new FileOutputStream(file)) {
            byte[] buff = text.getBytes();
            int i = 0;
            while(i<buff.length){
             os.write(buff[i]);
                i++;
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
