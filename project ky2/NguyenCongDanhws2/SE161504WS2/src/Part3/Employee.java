package Part3;
/**
 *
 * @author beche
 */
public class Employee {
    private String Code;
    private String Fullname;
    private String Phone;
    private int Salary;
    private int coefficient;
    private String department;

    public Employee() {
    }

    public Employee(String Code, String Fullname, String Phone, int Salary, int coefficient, String department) {
        this.Code = Code;
        this.Fullname = Fullname;
        this.Phone = Phone;
        this.Salary = Salary;
        this.coefficient = coefficient;
        this.department = department;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
        public void viewEmployee(){
        System.out.println(getCode() + " - "+getFullname() + " - "+ getSalary() + " - " + getCoefficient() + " - " + getDepartment());
    }  
}
