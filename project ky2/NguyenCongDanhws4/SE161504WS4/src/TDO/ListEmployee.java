package TDO;
import MyUtils.Utils;
/**
 *
 * @author beche
 */
public class ListEmployee {
    Employee[] list = new Employee[100];
    int n = 0;

    public Employee[] getList() {
        return list;
    }

    public void setList(Employee[] list) {
        this.list = list;
    }
    
    public void inputFulltime(){
        String code;
        String name;
        String phone;
        String address;
        String department;
        int salary;
        int absent;
        
        code = Utils.getStringreg("Enter code: ", "^FS\\d{5}$", "Code is not null", "Code is wrong format(FSXXXXX)!!!");
        name = Utils.getString("Enter name: ", "Name is not null !");
        phone = Utils.getStringreg("Enter phone: ", "^0\\d{9,11}$", "Phone is not null", "Number phone must be 10 or 12 digit!!");
        address = Utils.getString("Enter address: ", "Address is not null");
        department = Utils.getString("Enter department: ", "Department is not null");
        salary = Utils.getInt("Enter salary: ", 1500);
        absent = Utils.getInt("Enter absent: ", 0);
        list[n++] = new Emp_Fulltime(salary, absent, code, name, phone, address, department);
        System.out.println("Added fulltime successfully!");
    }
    
    public void inputParttime(){
        String code;
        String name;
        String phone;
        String address;
        String department;
        int DailyWage;
        int present;
        
        code = Utils.getStringreg("Enter code: ", "^FS\\d{5}$", "Code is not null", "Code is wrong format(FSXXXXX)!!!");
        name = Utils.getString("Enter name: ", "Name is not null !");
        phone = Utils.getStringreg("Enter phone: ", "^0\\d{9,11}$", "Phone is not null", "Number phone must be 10 or 12 digit!!");
        address = Utils.getString("Enter address: ", "Address is not null");
        department = Utils.getString("Enter department: ", "Department is not null");
        DailyWage = Utils.getInt("Enter Daily wage: ", 10);
        present = Utils.getInt("Enter present: ", 0);
        list[n++] = new Emp_Parttime(DailyWage, present, code, name, phone, address, department);
        System.out.println("Added parttime successfully!");
    }  
    
    public void printinfoFulltime(){
        for(Employee x: list){
            if (x instanceof Emp_Fulltime)
                x.printinfo();
        }
    }
    public void printinfoParttime(){
        for(Employee x: list){
            if(x instanceof Emp_Parttime)
                x.printinfo();
        }
    }
}
