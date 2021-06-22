package logic.tree;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Serhiy Dubovenko
 */
public class Tree {

    /**
     *
     * @param path - путь к каталогу
     * @param prefix - сдвиг при печати
     * @return
     */
    public List<String> ls(String path, String prefix){                                  // метод получения всех вложенных калогов и файлов
        List<String> tree = new ArrayList<>();
        File parentDir = new File(path);                                                 // создание объекта типа файл

        if(parentDir.isDirectory()){                                                     // ветка обработки каталогов
            tree.add(prefix+" "+parentDir.getName());                                    // добавление текущей директории в результирующую коллекцию
            List<String> localFiles = new ArrayList<>(Arrays.asList(parentDir.list()));  // получения списка файлов в директории
            for (int i = 0; i<localFiles.size(); i++) {                                  // проход файлами в директории
                File local = new File(parentDir.getPath(),localFiles.get(i));            // получение вложеннго файла
                tree.addAll( ls(local.getPath(),prefix+"\t --" ));                 // сбор информациии о вложенных файлах в подкаталоге
            }
        }else{                                                                           // ветка обработки файлов
            tree.add(prefix+" "+parentDir.getName());                                    // добвление файла в результирующую коллекцию
        }
        return tree;                                                                     // вывод
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        String path = "D:\\lbl";

        tree.ls(path, "").forEach(x->{    // печать дерева
            System.out.println(x);
        });
    }

}
