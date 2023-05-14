import java.util.Scanner;
/**
 *
 * @author beche
 */
public class Part1 {
    public static void main(String[] args) {
        int rows;
            int cols;
            int matrix[][];
            
            Scanner sc = new Scanner(System.in); // task1
            
            System.out.print("Enter number of rows: ");
            rows = sc.nextInt();
            System.out.print("Enter number of rols: ");
            cols = sc.nextInt();
            
            matrix = new int[rows][cols];
            System.out.println("Enter the matrix:"); 
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++ ){
                    System.out.print("\nm["+i+"] ["+j+"]=");
                    matrix [i][j] = sc.nextInt();
                }
            }
            
            System.out.println("Maatrix inputted:");
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    System.out.format("%3d", matrix[i][j]);
                }
                System.out.println("\n");
            }
            
            int sum = 0;            // Task 2
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    sum = sum + matrix[i][j];
                }
            }
            System.out.print("Sum:" + sum);
            
            System.out.println("\n");
            System.out.print("Average:" + (float)sum/(rows*cols));
    }
}
