package Shop_33m2.interfaces;

import Shop_33m2.department.AbstractBaseDepartment;

public interface EmployeeInterface {
    String getName();
    DepartmentInterface getDepartment();
    boolean isFree();

    void setDepartment(AbstractBaseDepartment abstractBaseDepartment);
}
