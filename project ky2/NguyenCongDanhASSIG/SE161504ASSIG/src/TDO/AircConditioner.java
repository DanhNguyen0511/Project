package TDO;

/**
 *
 * @author beche
 */
public class AircConditioner extends Product{
    private String power;

    public AircConditioner(String power, String code, String name, String brand, int price, int quantity) {
        super(code, name, brand, price, quantity);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return this.getCode() + " - " + this.getName() + " - " + this.getBrand() + " - " + this.power + " - " 
                + this.getPrice() + " - " + this.getQuantity();
    }
}    
