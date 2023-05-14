package GUI;

import TDO.ListStudent;
import java.util.Scanner;

/**
 *
 * @author beche
 */
public class DemoStudent {

    public static void main(String[] args) {
        ListStudent obj = new ListStudent();
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n====================Menu====================\n");
            System.out.println("1. Add new student.");
            System.out.println("2. Search a student.");
            System.out.println("3. Update name and mark of a student.");
            System.out.println("4. Remove a student .");
            System.out.println("5. List all students.");
            System.out.println("6. Exist.");
            System.out.print("Enter your choose: ");
            choice = Integer.parseInt(sc.nextLine());
            
            switch (choice) {
                case 1:
                    System.out.println("=============Add new Student================");
                    obj.AddStudent();
                    break;
                case 2:
                    System.out.println("===============Search a Student================");
                    obj.SearchStudent();
                    break;
                case 3:
                    System.out.println("===============Update information of Student==============");
                    obj.UpdateStu();
                    break;
                case 4:
                    System.out.println("================Remove a Student=================");
                    obj.RemoveStudent();
                    break;
                case 5:
                    System.out.println("====================List of All Student=================");
                    obj.ListAll();
                    break;
            }
        } while (choice < 6);
    }
}
