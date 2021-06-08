package logic.part_2_file;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Serhiy Dubovenko
 */
public class DirWork {

    public static void main(String[] args) {
        File dir1 = new File("D:\\lbl\\1\\2\\3\\4\\5");
        dir1.mkdirs();
        File dir2 = new File("D:\\lbl\\a");
        dir2.mkdir();
        File dir = new File("D:\\lbl");



        if(dir.isDirectory())
           new ArrayList<String>(Arrays.asList(dir.list()))
                   .forEach(x->{
                       File file = new File(dir, x);
                       if(file.isDirectory()) {
                           System.out.println(file.getName()+"; I am Directory! I am Папка ;)");
                       }else {
                           System.out.println(file.getName()+"; I am File!");
                       }});
        }

}
