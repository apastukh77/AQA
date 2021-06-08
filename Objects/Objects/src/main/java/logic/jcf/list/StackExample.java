package logic.jcf.list;

import java.util.Stack;

/**
 * @author Serhiy Dubovenko
 */
public class StackExample {

    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        st.add("Serhiy");
        st.add("Denis");
        st.add("Kate");
        st.add("Mihail");
        System.out.println(st);

        System.out.println("Search: "+st.search("Kate"));

        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);



    }

}
