package logic.jcf.map;

public class LinkedHashMap {

    public static void main(String[] args) {
        java.util.LinkedHashMap hm = new java.util.LinkedHashMap();

        hm.put("Istambul", 15462452L);
        hm.put("Miskow", 15462452L);
        hm.put("London", 15462452L);
        hm.put("San Usel", 15462452L);
        hm.put("Berlin", 15462452L);

        System.out.println(hm);
    }
}
