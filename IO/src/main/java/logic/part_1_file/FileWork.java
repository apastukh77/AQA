package logic.part_1_file;

import java.io.File;
import java.io.IOException;

/**
 * @author Serhiy Dubovenko
 */
public class FileWork {

    public static void main(String[] args) {

        File myDir = new File("D:\\lbl");

        if (myDir.isDirectory()) {
            File file = new File(myDir, "TestFile1.txt");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            System.out.println("test");
        }


    }

}
