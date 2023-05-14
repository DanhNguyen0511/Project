package Part1;

import java.util.Scanner;

/**
 *
 * @author beche
 */
public class test {
    public static void main(String[] args) {
        boolean cont = false;
        do{
            try{
                String s = "I love u";
                String parttern = "SE123";
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the string: ");
                s = sc.nextLine();
                if(! s.matches(parttern))
                    throw new Exception();
                    System.out.println("The string is "+ s);
                    cont = false;
            }catch(Exception e){
                System.out.println("The string is invalid");
                cont = true;
            }
        }while(cont);
    }
}
