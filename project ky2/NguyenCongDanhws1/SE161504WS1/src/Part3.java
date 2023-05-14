import java.util.Scanner;
/**
 *
 * @author beche
 */
public class Part3 {
    public static void main(String[] args) {
        String[] list = new String[10];

        for(int i = 0; i<10; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter name of student: ");
            list[i] = sc.nextLine().toUpperCase();    
        }
        System.out.println("\nThe list of student names:");
        for(int i = 0; i < 10; i++){
          System.out.println( i+". "+ list[i]);  
        }
    }
}
