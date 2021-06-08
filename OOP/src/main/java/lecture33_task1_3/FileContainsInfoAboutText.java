package lecture33_task1_3;

import java.io.*;
import java.util.*;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.SQLOutput;

public class FileContainsInfoAboutText {

        public static void main(String[] args) throws IOException {
        File f = new File("F:\\JAVA\\AQA\\OOP\\src\\main\\java\\lecture33_task1_3\\file-dir-input\\Shantaram.txt");
        //Reader reader = new FileReader("F:\\JAVA\\AQA\\OOP\\src\\main\\java\\lecture33_task1_3\\file-dir-input\\Shantaram.txt");
        FileInputStream c = new FileInputStream(f);
            //BufferedReader bufferedReader =  new BufferedReader(f);
        if (f.exists()) {
            //1. Абсолютный путь файла
            System.out.println("1. Абсолютный путь файла: " + f.getAbsolutePath() + ", имя файла: " + f.getName() + ";");
            //2. Размер файла (в килобайтах)
            System.out.println("2. Размер файла (в килобайтах): " + f.getTotalSpace() / 1000 + " Kb;");
            //3. Атрибуты файла (Просмотр, Чтение, Скрытый и тд)
            System.out.println("3. Атрибуты файла (Просмотр, Чтение, Скрытый и тд): ");
            System.out.println("\tПросмотр:" + f.canRead());
            System.out.println("\tВыполнение:" + f.canExecute());
            System.out.println("\tЗапись:" + f.canWrite());
            System.out.println("\tВыполнение:" + f.isHidden());
            //4. Количество предложений
            System.out.print("4. Количество предложений: ");

            byte[] bytesArray = new byte[(int) f.length()];
            int r = c.read(bytesArray);
            String s = new String(bytesArray);
            String sTrim = s.replace("\n", "").replace("\r", "").replace("...", ".").replace(".)", ")").replace("г.", "г");
            String[] dataS = sTrim.split("[.?!][\\n\\s][/\\s(?=(\\n|\\r|\\r\\n))/g]");
            String[] dataW = s.split("(\\W)+");
            System.out.println(dataS.length);
            //5. Количество слов
            System.out.print("5. Количество слов: ");
            System.out.println(dataW.length);
            //6. Количество знаков препинания
            System.out.print("6. Количество знаков препинания: ");
            char[] zn = {'.', ',', '-', ':', ';', '?', '!'};
            char[] ch = s.toCharArray();
            int count = 0;
            for (int i = 0; i < ch.length; i++) {
                for (int j = 0; j < zn.length; j++) {
                    if (ch[i] == zn[j]) {
                        count++;
                        break;
                    }
                }
            }
            System.out.println(count);
            //Контроль : 6. Количество знаков препинания
            System.out.print("Контроль : ");
            int before = s.length();
            int after = s.replaceAll("[.,\\-:;?!]", "").length();
            System.out.println("Количество знаков препинания в тексте: " + (before - after));
            //7.Количество пробелов
            System.out.print("7. Количество пробелов : ");
            char pr = ' ';
            int countPr = 0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == pr) {
                    countPr++;
                }
            }
            System.out.println(countPr);
            //Контроль : 7. Количество знаков препинания
            System.out.print("Контроль : ");
            int afterPr = s.replaceAll("[ ]", "").length();
            System.out.println("Количество пробелов в тексте: " + (before - afterPr));
            //8.Количество слов начинающихся с гласной буквы (латиница+кириллица)
            System.out.println("8.Количество слов начинающихся с гласной буквы (латиница+кириллица): ");
//            String countSLWVowel;
//
//            countSLWVowel = s.replaceAll("[^аеиоуэюяёАЕИОУЭЮЯЁaeiouAEIOU]", "");
//            System.out.println("Количество гласных букв в файле: " + countSLWVowel.length());

            try {
                BufferedReader reader = new BufferedReader(new FileReader(f));

                int countSLWVowel = 0;
                char[] chVowel = {'а','е','и','о','у','э','ю','я','ё','А','Е','И','О','У','Э','Ю','Я','Ё','a','e','i','o','u','A','E','I','O','U'};
                while (reader.ready())
                {
                    String lineFromFile;
                    lineFromFile = reader.readLine();
                    String lineFromFileWasTrimed = lineFromFile.trim();
                    char [] charNew = lineFromFileWasTrimed.toCharArray();
                    for (int i = 0; i<=charNew.length; i++){
                        for(int j = 0; j<=chVowel.length; j++) {
                            if (charNew[0] == chVowel[j]) {
                                countSLWVowel++;
                            }
                        }
                    }
                }
                    System.out.println(countSLWVowel);
                reader.close();
             } catch (IOException e) {
                System.out.println("ERROR");
            };
        } else System.out.println("Файла нет!");



//                Количество слов начинающихся с гласной буквы (латиница+кириллица).
//                Количество слов начинающихся с согласной буквы (латиница+кириллица).
//                Отношение слов на латинице к словам на кириллице.
//                Отношение латинских символов к кириллическим символам.
//                Отношение знаков препинания к символам (знаки + кол-во пробелов).


    }
}