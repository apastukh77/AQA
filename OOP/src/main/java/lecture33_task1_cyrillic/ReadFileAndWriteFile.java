package lecture33_task1_cyrillic;

import java.io.*;

public class ReadFileAndWriteFile {
    public static void main(String[] args) {
        try (
                FileReader fr = new FileReader("F:\\JAVA\\AQA\\OOP\\src\\main\\java\\lecture33_task1_cyrillic\\file-dir-input\\Shantaram.txt");
                FileWriter fw = new FileWriter("F:\\JAVA\\AQA\\OOP\\src\\main\\java\\lecture33_task1_cyrillic\\file-dir-output\\Shantaram2.txt");
        )
        {
            int c;
            while ((c = fr.read()) != -1) {
                if ((c>=1040 && c<= 1103) || c == 1025 || c == 1105 || c == 32 || c == 10 || c == 9) {
                    fw.write(c);
                }
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}


