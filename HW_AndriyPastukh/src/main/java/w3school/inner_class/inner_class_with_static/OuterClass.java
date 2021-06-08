package w3school.inner_class.inner_class_with_static;

 class OuterClass {
    int x = 10;

    static class InnerClass{
        int y = 5;
    }
}

class Main{ //if set public it needs locate code in Main.java 
    public static void main(String[] args) {
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y);
    }
}
