package Prototype;

import java.util.List;

public class PrototypePatternTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        //Use the clone method to get the Employee object
        Employees clone1 = (Employees) employees.clone();
        Employees clone2 = (Employees) employees.clone();
        List<String> list = clone1.getEmpList();
        list.add("Cuc");
        List<String> list1 = clone2.getEmpList();
        list1.remove("Ngoc");

        System.out.println("emps List: " + employees.getEmpList());
        System.out.println("empsnew List: " + list);
        System.out.println("empsNew1 List: " + list1);
    }
}
