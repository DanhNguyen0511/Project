package TDO;
/**
 *
 * @author beche
 */
public class Emp_Fulltime extends Employee{
     private int salary;
    private int absent;

    public Emp_Fulltime(int salary, int absent, String code, String name, String phone, String address, String department) {
        super(code, name, phone, address, department);
        this.salary = salary;
        this.absent = absent;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }
    public int totalSalary(){
        return salary - (absent*35);
    }
    public void printinfo(){
        System.out.println(getCode() + " - " + getName() + " - "+ totalSalary());
    }
}
