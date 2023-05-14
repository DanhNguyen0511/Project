package Part1;

/**
 *
 * @author beche
 */
public class Tester {
    public static void main(String[] args) {
        Guitar obj1 = new Guitar();
        Guitar obj2 = new Guitar("G123", "Sony", "Model123", 2000, "hardWood", "softWood");
        System.out.println("State of Guitar1:");
        obj1.createSound();
        System.out.println("State of Guitar2:");
        obj2.createSound();
        
        System.out.println("set price = 3000 of Guitar1");
        obj1.setPrice(3000);
        System.out.println("get price of Guitar1:" + obj1.getPrice());
    }
}
