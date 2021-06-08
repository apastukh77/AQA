package newthinktank;

public class AboutStrings {

    public static void main(String[] args) {
        String name = "Darek";
        String wName = name + " Banas";
        wName += " is his/her name";
        String drsDog = "K" + 9;

        System.out.println(wName.charAt(0));
        System.out.println(wName.contains("Darek"));
        System.out.println(wName.indexOf("Darek"));
        System.out.println(wName.length());
        System.out.println("dog equals cat : " + ("dog".equalsIgnoreCase("cat")));
        System.out.println(wName.replace("Darek", "Bob"));


    }

}
