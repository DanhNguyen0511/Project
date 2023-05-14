package Part3;
import java.util.Scanner;
/**
 *
 * @author beche
 */
public class performEmployee{
    public Employee[] Inputemployee(){
        String Code, Fullname, Phone, department;
        int Salary, coefficient;
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of employees:");
        n = Integer.parseInt(sc.nextLine());
        Employee[] list = new Employee[n];
        
        for(int i = 0; i < n; i++ ){
             System.out.println("Enter information employee " + (i+1));
             System.out.print("Employee code: ");
             Code = sc.nextLine();
             System.out.print("Employee fullname: ");
             Fullname = sc.nextLine();
             System.out.print("Employee phone: ");
             Phone = sc.nextLine();
             System.out.print("Employee department: ");
             department = sc.nextLine();
             System.out.print("Employee salary: ");
             Salary = Integer.parseInt(sc.nextLine());
             System.out.print("Employee salary coefficient: ");
             coefficient = Integer.parseInt(sc.nextLine());
             
             Employee em = new Employee(Code, Fullname, Phone, Salary, coefficient, department);
             list[i] = em;
             System.out.println("\n-------------------------------------------------------------------------");
        }
        return list;
    }    
    public void viewEmployee(Employee[] list){
        for(Employee x: list){
            x.viewEmployee();
        }
    }
    public void totalSalary(Employee[] list){
        for(Employee x: list){    
            System.out.println("The total salary of employee "+x.getCode() +": " + (x.getSalary()+x.getCoefficient()));
        }
    }
        public boolean updateSalary(Employee[] list){
            boolean check=false;
            Scanner sc = new Scanner(System.in);
            String codeUpdate;
            int salaryUpdate;
            
            for(Employee x: list){
                System.out.print("Enter the code of the employee you want to update salary:");
                codeUpdate = sc.nextLine();
                if(x.getCode().equalsIgnoreCase(codeUpdate)){
                    System.out.println("Salary update:");
                    salaryUpdate = Integer.parseInt(sc.nextLine());
                    x.setSalary(salaryUpdate);
                    x.viewEmployee();
                    check = true;
                }
            }
            return check;
        }
        public static void main(String[] args) {
            performEmployee obj = new performEmployee();
            boolean result = false;
            Employee[] list = obj.Inputemployee();
            System.out.println("Employee List: ");
            obj.viewEmployee(list);
            obj.totalSalary(list);
            System.out.println("Update employee salary: ");
            result = obj.updateSalary(list);
            System.out.println(result?"Update Successful":"Update Fail");    
        }
}
