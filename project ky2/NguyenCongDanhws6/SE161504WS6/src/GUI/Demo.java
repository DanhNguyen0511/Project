package GUI;

import TDO.ListEmployee;
import java.util.Scanner;

/**
 *
 * @author beche
 */
public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        String filename ="employees.txt";
        ListEmployee list = new ListEmployee();

        do {
            System.out.println("1. Adding new employee.");
            System.out.println("2. Removing employee.");
            System.out.println("3. Promoting the salary of an employee.");
            System.out.println("4. Print a list of employees in descending order of salary.");
            System.out.println("5. Save the list to file.");
            System.out.println("6. Exist.");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    list.AddNewEmp();
                    break;
                case 2:
                    list.removeEmp();
                    break;
                case 3:
                    list.promote();
                    break;
                case 4:
                    list.print();
                    break;
                case 5:
                    list.saveToFile(filename);
                    break;
            }
        } while (choose < 6);
    }
}
