package TDO;
/**
 *
 * @author beche
 */
public class Emp_Parttime extends Employee{
     private int DailyWage;
    private int present;
    public Emp_Parttime(int DailyWage, int present, String code, String name, String phone, String address, String department) {
        super(code, name, phone, address, department);
        this.DailyWage = DailyWage;
        this.present = present;
    }
    public int getDailyWage() {
        return DailyWage;
    }

    public void setDailyWage(int DailyWage) {
        this.DailyWage = DailyWage;
    }

    public int getPresent() {
        return present;
    }

    public void setPresent(int present) {
        this.present = present;
    }
    
    public int totalSalary(){
        return DailyWage*present;
    }
    public void printinfo(){
        System.out.println(getCode() + " - " + getName() +"-"+ totalSalary());
    }
}
