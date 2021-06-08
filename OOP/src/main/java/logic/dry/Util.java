package logic.dry;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Serhiy Dubovenko
 */
public class Util {


    public void text(){
        String str = ";";

        if(str.contains("1")||str.contains("4")){
            try {
                new Util().writeText("String text", new File(""));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(str.contains("2")){

        }

        if(str.contains("3")){
            try {
                new Util().writeText("String text", new File(""));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(str.contains("4")){
            try {
                new Util().writeText1("String text", "", "");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(str.contains("5")){
            try {
                new Util().writeText("String text", new File(""));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void writeText(String text, File file) throws IOException {
        System.out.println("TxtBinaryWriter");
        OutputStream os = new FileOutputStream(file);
        byte[] buffer = text.getBytes();
        int i = 0;
        while(i<buffer.length){
            os.write(buffer[i]);
            i++;
        }
        os.flush();
        os.close();
    }

    public void writeText(String text, String path) throws IOException {
        File file = new File("path");
        System.out.println("TxtBinaryWriter");
        OutputStream os = new FileOutputStream(file);
        byte[] buffer = text.getBytes();
        int i = 0;
        while(i<buffer.length){
            os.write(buffer[i]);
            i++;
        }
        os.flush();
        os.close();
    }

    public void writeText(String text, String path, String fileName ) throws IOException {
        File file = new File("path", fileName);
        System.out.println("TxtBinaryWriter");
        OutputStream os = new FileOutputStream(file);
        byte[] buffer = text.getBytes();
        int i = 0;
        while(i<buffer.length){
            os.write(buffer[i]);
            i++;
        }
        os.flush();
        os.close();
    }

    public void writeText1(String text, String path, String fileName ) throws IOException {
        new Util().writeText(text,path+"//"+fileName );
    }







}
