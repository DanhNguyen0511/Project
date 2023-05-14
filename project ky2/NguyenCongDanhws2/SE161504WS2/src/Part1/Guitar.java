package Part1;
/**
 *
 * @author beche
 */
public class Guitar {
    private String serialNumber;
    private String builer;
    private String model;
    private int price;
    private String backWood;
    private String topWood;

    public Guitar() {
    }

    public Guitar(String serialNumber, String builer, String model, int price, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.builer = builer;
        this.model = model;
        this.price = price;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBuiler() {
        return builer;
    }

    public void setBuiler(String builer) {
        this.builer = builer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }
    
    public void createSound(){
        System.out.println("serialNumber:" + getSerialNumber());
        System.out.println("price:" + getPrice());
        System.out.println("builder:" + getBuiler());
        System.out.println("model:" + getModel());
        System.out.println("backWood:" + getBackWood());
        System.out.println("topWood:" + getTopWood());
    }
        
}
