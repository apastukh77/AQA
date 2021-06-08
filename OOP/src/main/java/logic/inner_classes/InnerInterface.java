package logic.inner_classes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Serhiy Dubovenko
 */
public class InnerInterface {

    interface Logicable {
        String getText();
    }


    public static void main(String[] args) {

        List list = new ArrayList();

        InnerInterface.Logicable ii = new Logicable() {
            @Override
            public String getText() {
                return "text";
            }
        };
    }

}
