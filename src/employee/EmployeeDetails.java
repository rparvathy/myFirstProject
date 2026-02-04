package employee;

public class EmployeeDetails {
    private int id;
    private String name;
    private String department;
    private int age;
    private String email;
    private Address address;

    public EmployeeDetails() {
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address=" + address.toString() +
                '}';
    }

    public EmployeeDetails(int id, String name, String department, int age, String email, Address address) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
