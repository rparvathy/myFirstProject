package listPrograms;

import java.util.ArrayList;

class Emp{
    int empId;
    String empName;
    String empDept;

    Emp(int empId, String empName,String empDept){
        this.empId = empId;
        this.empName=empName;
        this.empDept=empDept;
}
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Emp> empList = new ArrayList<>();
        Emp emp1=new Emp(1,"Parvathy","Computer Science");
        Emp emp2=new Emp(2,"Jany","Electrical Dept");
        Emp emp3=new Emp(3,"John","Electronics dept");
        Emp emp4=new Emp(4,"Doe","Mechanical Dept");
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

    }
}
}
