package logic.part_1_file;

import java.io.File;
import java.io.IOException;

/**
 * @author Serhiy Dubovenko
 */
public class FileWork2 {

    public static void main(String[] args) {
        File file = new File("D:\\lbl", "TestFile.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
