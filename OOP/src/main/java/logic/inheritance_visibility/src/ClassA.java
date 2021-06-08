package logic.inheritance_visibility.src;

/**
 * @author Serhiy Dubovenko
 */
public class ClassA {

    private void getPrivateMethod(String text){
        System.out.println("I am private. Very private method!!!!");
    }

    void getPackageMethod(String text, int i){
        System.out.println("I am package!!!!");
    }

    protected void getProtectedMethod(String text, int i){
        System.out.println("I am protected O_O!!!!");
    }

    public void getPublicMethod(String text, int i){
        System.out.println("I am public, like Pablic Zibrov");
    }


    public void workMethod(){
        getPrivateMethod("String text");
        getPackageMethod("String text",1);
        getProtectedMethod("String text", 2);
        getPublicMethod("String text", 3);
    }

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.getPrivateMethod("String text");
        classA.getPackageMethod("String text",1);
        classA.getProtectedMethod("String text",1);
        classA.getPublicMethod("String text",1);
    }
}
