package logic.inner_classes;

/**
 * @author Serhiy Dubovenko
 */
public class InnerInterfaceClass  implements InnerInterface.Logicable{
    @Override
    public String getText() {
        return "Text";
    }
}
