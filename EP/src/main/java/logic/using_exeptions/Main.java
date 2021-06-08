package logic.using_exeptions;

import logic.create_exception.MyException;

import java.io.*;

/**
 * @author Serhiy Dubovenko
 */
public class Main {
    private static final String MODE = "HTML";
    private static final String TEXT = "My text";
    public static final String PATH1 = "D:\\Lab1\\Text1.txt";
    public static final String PATH2 = "D:\\Lab1\\Text2.html";

    protected void writeToTxtFile(String text, String path){
        File file =new File(path);
        OutputStream os =null;
        try {
            file.createNewFile();

            byte[] buff = text.getBytes();
            int i = 0;
            while(i<buff.length){
             os.write(buff[i]);
                i++;
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void writeToHtmlFile(String text, String path){

        String template = "<html> <head><title>My text</title> </head> <body> <p>"+text+" </p> </body> </html>";
        File file =new File(path);
        Writer w = null;
        try {
            w = new FileWriter(file);
            w.write(template);
            w.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                w.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void runner(String text, String mode) throws MyException {
        if(Modes.TXT.toString().equals(mode)){
            new Main().writeToTxtFile(text, PATH1);
        }else if(Modes.HTML.toString().equals(mode)){
            new Main().writeToHtmlFile(text, PATH2);
        }else{
            throw new MyException("The selected "+MODE+"does not support!", new Exception());
        }

    }




    public static void main(String[] args) {

        try {
            new Main().runner(TEXT, MODE);
        } catch (MyException e) {
            e.printStackTrace();
        }


    }
}
