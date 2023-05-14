package TDO;

/**
 *
 * @author beche
 */
public class Tivi extends Product {
    private String size;

    public Tivi(String size, String code, String name, String brand, int price, int quantity) {
        super(code, name, brand, price, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return this.getCode() + " - " + this.getName() + " - " + this.getBrand() + " - " + this.getSize() + " - " 
                + this.getPrice() + " - " +  this.getQuantity();
    }
}
