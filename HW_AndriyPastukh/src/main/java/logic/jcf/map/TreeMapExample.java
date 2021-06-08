package logic.jcf.map;

public class TreeMapExample {

    treeMap<String, Long> hm = new TreeMap<>();

        hm.put("Istambul", 15462452L);
        hm.put("Miskow", 15462452L);
        hm.put("London", 15462452L);
        hm.put("San Usel", 15462452L);
        hm.put("Berlin", 15462452L);


        hm.put("", null);
        System.out.println(hm);
}
