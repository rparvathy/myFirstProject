//Reverse an ArrayList
package listPrograms;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
    int empId;
    String empName;
    String empDept;

    Employee(int empId, String empName,String empDept){
        this.empId = empId;
        this.empName=empName;
        this.empDept=empDept;
    }

}
public class RevArrayList {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        Employee emp1=new Employee(1,"Parvathy","Computer Science");
        Employee emp2=new Employee(2,"Jany","Electrical Dept");
        Employee emp3=new Employee(3,"John","Electronics dept");
        Employee emp4=new Employee(4,"Doe","Mechanical Dept");
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

        System.out.println("Before reversing : ");
        printElements(empList);
        Collections.reverse(empList);
        System.out.println("After reversing : ");
        printElements(empList);


    }
    public static void printElements(ArrayList<Employee>empList){
        for (Employee employee : empList) {
            System.out.println("EmpID: " + employee.empId + " EmpName: " + employee.empName + " EmpDept: " + employee.empDept);
        }
    }



}
