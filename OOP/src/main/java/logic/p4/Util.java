package logic.p4;

import java.util.Locale;

/**
 * @author Serhiy Dubovenko
 */
public class Util {


    private String getSubstring(String  text){
        return text.substring(1, 10);
    }


    private String getLowerCaseString(String  text){
        return new Util().getSubstring(text).toLowerCase();
    }

    public String concatText(String text,  String text1){
        return new Util().getSubstring(text).toLowerCase()+text1;
    }

}
