package lecture33_task1_latin;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileAndWriteFile {
    public static void main(String[] args) {
        try (
                FileReader fr = new FileReader("F:\\JAVA\\AQA\\OOP\\src\\main\\java\\lecture33_task1_latin\\file-dir-input\\Shantaram.txt");
                FileWriter fw = new FileWriter("F:\\JAVA\\AQA\\OOP\\src\\main\\java\\lecture33_task1_latin\\file-dir-output\\Shantaram2.txt");
        )
        {
            int c;
            while ((c = fr.read()) != -1) {
                if ((c>=65 && c<= 122) || c == 32 || c == 10 || c == 9) {
                    fw.write(c);
                }
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
