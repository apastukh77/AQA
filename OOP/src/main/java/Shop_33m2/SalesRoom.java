package Shop_33m2;

import Shop_33m2.interfaces.DepartmentInterface;
import Shop_33m2.interfaces.VisitorInterface;
import Shop_33m2.staff.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    public static final String SHOP_NAME="33m2";
    private ArrayList<DepartmentInterface> departmentList = new ArrayList<DepartmentInterface>();
    private String name;
    private ArrayList<VisitorInterface> visitorList = new ArrayList<VisitorInterface>();
    //private Administrator administrator;
    public  ArrayList<DepartmentInterface> getDepartmentList() {return departmentList;}
    public void addDepartment(DepartmentInterface department){ departmentList.add(department);}
    public void addVisitor(VisitorInterface visitor) {visitorList.add(visitor);}
}
