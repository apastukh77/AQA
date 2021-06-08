package logic.part_2_file;

import java.io.*;

/**
 * @author Serhiy Dubovenko
 */
public class FileWork {

    private void writeToFile(File file, String text){
        try (OutputStream os = new FileOutputStream(file)) {
            os.write(text.getBytes());
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFromFile(File file){
        StringBuilder sb = new StringBuilder();
        try (InputStream is = new FileInputStream(file)){
            int buff;
            while((buff =is.read())>-1){
                sb.append((char)buff) ;
            }
            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {

        String text = "Hello word!";                      // входной текст
        FileWork fw = new FileWork();                     // файл для записи и чтения

        File file = new File("D:\\lbl\\MyFile.txt");

        System.out.println("write file");
        fw.writeToFile(file, text);
        System.out.println("read file");
        fw.readFromFile(file);


    }
}
