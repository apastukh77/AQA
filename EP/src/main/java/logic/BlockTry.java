package logic;

import java.io.File;
import java.io.IOException;

/**
 * @author Serhiy Dubovenko
 */
public class BlockTry {

    public static final String PATH = "D:\\Lab1\\Text1.txt";

    protected void createFile(String path){
        try {
            new File(path).createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void removeFile(String path){
            new File(path).delete();
    }

    protected void example(){
        try {
            throw new IOException("IO Exception");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        BlockTry bt = new BlockTry();
        bt.createFile(PATH);
      //  bt.removeFile(PATH);


    }

}
