package GUI;

import MyUtils.Utils;
import TDO.ListProduct;
import java.util.Scanner;
/**
 *
 * @author beche
 */
public class DemoProduct {
    public static void main(String[] args) {
        ListProduct objP = new ListProduct();
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\n===================================Menu====================================\n");
            System.out.println("1. Add a new product.");
            System.out.println("2. Print out the list of products.");
            System.out.println("3. Print a list of Smartphones in descending order of price.");
            System.out.println("4. Print a list of Tivis in Ascending order of price.");
            System.out.println("5. Print a list of of Air-conditioner  in descending order of price.");
            System.out.println("6. Print information about products with the highest prices.");
            System.out.println("7. Update the product information.");
            System.out.println("8. Delete an product.");
            System.out.println("9. Print the total amount of all products.");
            System.out.println("10. Exit the program.");
            choice = Utils.getInt("Choose an option: ", 0);
            
            switch(choice){
                case 1:     objP.AddProduct();
                                break; 
                case 2:     System.out.println("=================================== List of Product ====================================");
                                objP.PrintPro();
                                break;
                case 3:     System.out.println("===================== List of Smartphones in descending order of price =========================");
                                objP.DesceSmart();
                                break;
                case 4:     System.out.println("==================== List of SmartTiviphones in Ascending order of price =========================");
                                objP.AsceTivi();
                                break;
                case 5:     System.out.println("===================== List of Air-conditioner in descending order of price ===========================");
                                objP.DesceAir();
                                break;
                case 6:     System.out.println("=========================== The products with the highest price ===============================");
                                objP.HighestPrice();
                                break;
                case 7:     System.out.println("============================= Update the product information =================================");
                                objP.UpdateInfo();
                                break;
                case 8:     System.out.println("===========================Delete an product based on the code ================================");
                                objP.DeletePro();
                                break;
                 case 9:    System.out.println("==============================The total amount of all products ==================================");
                                objP.TotalAmount();
                                break;
            }
        }while(choice < 10);
    }
}
