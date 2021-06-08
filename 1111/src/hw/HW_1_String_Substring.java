package hw;

public class HW_1_String_Substring {

    public static void main(String[] args) {
        System.out.println("================================");
        String text = "These can .be either file templat. custom or predefined live templates that ar. various wrappers, or automatic pairing of characters.";
        String tmp = text.substring(text.indexOf('.'), text.lastIndexOf('.'));
        System.out.println(tmp);
        System.out.println("================================");
    }
}
