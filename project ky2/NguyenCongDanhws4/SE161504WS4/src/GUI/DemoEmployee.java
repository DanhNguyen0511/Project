package GUI;
import MyUtils.Utils;
import TDO.ListEmployee;
/**
 *
 * @author beche
 */
public class DemoEmployee {
    public static void main(String[] args) {
        ListEmployee objlist = new ListEmployee();
        
        int choice = 0;
        do{
            System.out.println("\n--------------------Main Menu--------------------------\n");
            System.out.println("1. Create a Fulltime employee.");
            System.out.println("2. Create a Parttime employee.");
            System.out.println("3. Print a list of Fulltime employee.");
            System.out.println("4. Print a list of Fulltime employee.");
            System.out.println("5. Exit.");
            choice = Utils.getInt("Enter choice: ", 0);
            switch(choice){
                case 1: objlist.inputFulltime();
                             break;
                case 2: objlist.inputParttime();
                             break;
                case 3: objlist.printinfoFulltime();
                             break;
                case 4: objlist.printinfoParttime();
                             break;
                case 5: System.out.println("Good bye!!!");
                             System.exit(0);
            }
    }while(choice <= 5);
    }
}
