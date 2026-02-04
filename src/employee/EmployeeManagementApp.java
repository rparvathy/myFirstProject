package employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementApp {
    public static void main(String[] args) {
        EmployeeDetails employeeDetails = new EmployeeDetails();
        Address address= new Address("xyz","Alappuzha","Kerala","India",690510);
        employeeDetails.setName("Anu");
        employeeDetails.setId(1);
        employeeDetails.setAge(25);
        employeeDetails.setEmail("anus@gmail.com");
        employeeDetails.setDepartment("CSE");
        employeeDetails.setAddress(address);

        System.out.println(employeeDetails.toString());
        List<EmployeeDetails> list = new ArrayList<>();
        list.add(employeeDetails);
        System.out.println(list);
    }
}
