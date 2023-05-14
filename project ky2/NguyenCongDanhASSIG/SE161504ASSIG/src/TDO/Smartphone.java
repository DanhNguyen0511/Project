package TDO;

/**
 *
 * @author beche
 */
public class Smartphone extends Product {
    private String Ram;
    private String CPU;
    private String size;

    public Smartphone(String Ram, String CPU, String size, String code, String name, String brand, int price, int quantity) {
        super(code, name, brand, price, quantity);
        this.Ram = Ram;
        this.CPU = CPU;
        this.size = size;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String Ram) {
        this.Ram = Ram;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return this.getCode() + " - " + this.getName() + " - " + this.getBrand() + " - " + this.getRam() + " - " 
                + this.getCPU() + " - " + this.getSize() + " - " + this.getPrice() + " - " + this.getQuantity();
    }
}
