package logic.entity;

public class StringMethods {

    public static void main(String[] args) {

        String text = "StringWork";
        System.out.println("The length of the string: \n"+text.length());
        String text2 = "На краю дороги стоял дуб.";
        System.out.println("\t\t"+text2);
        System.out.println("Replace \"о\" to \"а\" char: \n"+"\t\t"+text2.replaceAll("о","а")+"\n");
        System.out.println("Char with #5 index: "+text.charAt(5)+" | " +text.indexOf("g"));
        System.out.println("To Uppercase: "+text.toUpperCase());

        char[] newArr = {'S','t','r','i','n','g','W','o','r','k'};
        String stringFromCharArray = new String(newArr);
        System.out.println("String from char[] (Array): \n"+stringFromCharArray);

        String[] words = text2.split(" ");
        for (int i =0; i<words.length;i++){
            System.out.println(words[i]);
        }

        StringBuilder sb = new StringBuilder(text);
        System.out.println(sb.reverse().toString());


    }
   }
