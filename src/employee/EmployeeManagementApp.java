package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagementApp {

    static void addEmployees(List<EmployeeDetails> employee, Scanner sc) {
        char choice;
        do {
            EmployeeDetails employeeDetails = new EmployeeDetails();
            System.out.println("Enter id: ");
            employeeDetails.setId(sc.nextInt());
            sc.nextLine();

            System.out.println("Enter name: ");
            employeeDetails.setName(sc.nextLine());

            System.out.println("Enter department: ");
            employeeDetails.setDepartment(sc.nextLine());

            System.out.println("Enter age: ");
            employeeDetails.setAge(sc.nextInt());
            sc.nextLine();

            System.out.println("Enter email: ");
            employeeDetails.setEmail(sc.nextLine());

            //address
            Address address = new Address();
            System.out.println("Enter house name: ");
            address.setHouseName(sc.nextLine());

            System.out.println("Enter city: ");
            address.setCity(sc.nextLine());

            System.out.println("Enter state: ");
            address.setState(sc.nextLine());

            System.out.println("Enter country: ");
            address.setCountry(sc.nextLine());

            System.out.println("Enter pin-code: ");
            address.setPinCode(sc.nextInt());
            sc.nextLine();

            employeeDetails.setAddress(address);
            employee.add(employeeDetails);

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
            sc.nextLine();

        } while (choice == 'y' || choice == 'Y');

    }

    static void viewEmployees(List<EmployeeDetails> employee) {
        System.out.println("Employee Details :");
        for (EmployeeDetails emp : employee) {
            System.out.println("ID: " + emp.getId());
            System.out.println("Name: " + emp.getName());
            System.out.println("Age: " + emp.getAge());
            System.out.println("Email: " + emp.getEmail());
            System.out.println("Department: " + emp.getDepartment());
            System.out.println("Address: " + emp.getAddress().toString());
        }
    }

    static void updateEmployee(List<EmployeeDetails> employee, Scanner sc) {
        System.out.println("do you want to update an employee ? (y/n)");
        char choice = sc.next().charAt(0);
        sc.nextLine();
        if (choice != 'y' && choice != 'Y') {
            return;
        }
        System.out.println("enter the employee id to search");
        int searchId = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for (EmployeeDetails emp : employee) {
            if (emp.getId() == searchId) {

                System.out.println("Enter new name: ");
                emp.setName(sc.nextLine());

                System.out.println("Enter new department: ");
                emp.setDepartment(sc.nextLine());

                System.out.println("Enter new age: ");
                emp.setAge(sc.nextInt());
                sc.nextLine();

                System.out.println("Enter new email: ");
                emp.setEmail(sc.nextLine());

                // update address
                Address address = emp.getAddress();

                System.out.println("Enter new city: ");
                address.setCity(sc.nextLine());

                System.out.println("Enter new pin-code: ");
                address.setPinCode(sc.nextInt());
                sc.nextLine();

                found = true;
                System.out.println("Employee updated successfully!");
                break;

            }
        }
        if (!found) {
            System.out.println("Employee is not found");
        }
    }

    static void deleteEmployee(List<EmployeeDetails> employee, Scanner sc) {
        System.out.println("do you want to delete an employee ? (y/n)");
        char choice = sc.next().charAt(0);
        sc.nextLine();
        if (choice != 'y' && choice != 'Y') {
            return;
        }
        System.out.println("enter the employee id to delete");
        int deleteId = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for (int i = 0; i < employee.size(); i++) {
            if (employee.get(i).getId() == deleteId) {
                employee.remove(i);
                found = true;
                System.out.println("Employee deleted successfully!");
                break;

            }
        }
        if (!found) {
            System.out.println("Employee is not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<EmployeeDetails> employee = new ArrayList<>();
        addEmployees(employee, sc);
        viewEmployees(employee);
        updateEmployee(employee, sc);
        System.out.println("After Update, Employee list: ");
        viewEmployees(employee);
        deleteEmployee(employee, sc);
        System.out.println("After delete,employee list: ");
        viewEmployees(employee);
    }
}

