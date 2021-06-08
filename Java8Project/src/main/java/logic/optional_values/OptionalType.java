package logic.optional_values;

import java.util.Optional;

public class OptionalType {

    /*

            {"id":15024,"Name":"Serhiy", "Role":"Student", "Course":"History"}

            {"id":754,"Name":"Ringo", "Role":"Student", "Course":["History", "Spanish", "Sport"]}
     */

    private int id;
    private String name;
    private String role;
    private Optional<String> cource;



}
