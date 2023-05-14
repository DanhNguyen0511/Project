package TDO;

import MyUtils.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author beche
 */
public class ListProduct {

    List<Product> P = new ArrayList<>();

    public void AddProduct() {
        Scanner sc = new Scanner(System.in);
        int choice;
        String code;
        String name;
        String brand;
        int price;
        int quantity;
        boolean check;

        do {
            System.out.println("=========Menu add products==========");
            System.out.println("1. Add a new Smartphone");
            System.out.println("2. Add a new Tivi");
            System.out.println("3. Add a new Air conditioner");
            System.out.println("4. Exit to main menu.");
            System.out.print("choose (1or2or3or4): ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    do {
                        code = Utils.getStringreg("Enter code: ", "^SM\\d{3}$", "Code is not null", "Code is wrong format(SM000)!!!");
                        if (checkcode(code) >= 0) {
                            System.out.println("This code is exist!");
                            check = true;
                        } else {
                            check = false;
                        }
                    } while (check == true);
                    name = Utils.getString("Enter name: ", "Name is not null !");
                    brand = Utils.getString("Enter brand: ", "Brand is not null !");
                    String Ram = Utils.getString("Enter Ram: ", "Ram is not null ");
                    String CPU = Utils.getString("Enter CPU: ", "CPU is not null !");
                    String size = Utils.getString("Enter size: ", "Size is not null !");
                    price = Utils.getInt("Enter Price: ", 0);
                    quantity = Utils.getInt("Enter Quantity: ", 0);

                    Product s = new Smartphone(Ram, CPU, size, code, name, brand, price, quantity);
                    P.add(s);
                    System.out.println("ADDED A SMARTPHONE SUCCESSFULLY!");
                    break;
                case 2:
                    do {
                        code = Utils.getStringreg("Enter code: ", "^TI\\d{3}$", "Code is not null", "Code is wrong format(TI000)!!!");
                        if (checkcode(code) >= 0) {
                            System.out.println("This code is exist!");
                            check = true;
                        } else {
                            check = false;
                        }
                    } while (check == true);
                    name = Utils.getString("Enter name: ", "Name is not null !");
                    brand = Utils.getString("Enter brand: ", "Brand is not null !");
                    size = Utils.getString("Enter size: ", "Size is not null !");
                    price = Utils.getInt("Enter Price: ", 0);
                    quantity = Utils.getInt("Enter Quantity: ", 0);

                    Product t = new Tivi(size, code, name, brand, price, quantity);
                    P.add(t);
                    System.out.println("ADDED A TIVI SUCCESSFULLY!");
                    break;
                case 3:
                    do {
                        code = Utils.getStringreg("Enter code: ", "^AIR\\d{3}$", "Code is not null", "Code is wrong format(AIR000)!!!");
                        if (checkcode(code) >= 0) {
                            System.out.println("This code is exist!");
                            check = true;
                        } else {
                            check = false;
                        }
                    } while (check == true);
                    name = Utils.getString("Enter name: ", "Name is not null !");
                    brand = Utils.getString("Enter brand: ", "Brand is not null !");
                    String power = Utils.getString("Enter power: ", "Power is not null !");
                    price = Utils.getInt("Enter Price: ", 0);
                    quantity = Utils.getInt("Enter Quantity: ", 0);

                    Product a = new AircConditioner(power, code, name, brand, price, quantity);
                    P.add(a);
                    System.out.println("ADDED AN AIR-CONDITIONER SUCCESSFULLY!");
                    break;
            }
        } while (choice < 4);
    }

    public int checkcode(String code) {
        for (int i = 0; i < P.size(); i++) {
            if (P.get(i).getCode().equalsIgnoreCase(code)) {
                return i;
            }
        }
        return -1;
    }

    public void PrintPro() {
        Iterator iter = P.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public void DesceSmart() {
        Collections.sort(P, new Comparator<Product>() {
            @Override
            public int compare(Product t, Product t1) {
                int d = t.getPrice() - t1.getPrice();
                if (d > 0) {
                    return -1;
                } else if (d < 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        for (Product x : P) {
            if (x instanceof Smartphone) {
                System.out.println(x);
            }
        }
    }

    public void AsceTivi() {
        Collections.sort(P, new Comparator<Product>() {
            @Override
            public int compare(Product t, Product t1) {
                int d = t.getPrice() - t1.getPrice();
                if (d > 0) {
                    return 1;
                } else if (d < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for (Product x : P) {
            if (x instanceof Tivi) {
                System.out.println(x);
            }
        }
    }

    public void DesceAir() {
        Collections.sort(P, new Comparator<Product>() {
            @Override
            public int compare(Product t, Product t1) {
                int d = t.getPrice() - t1.getPrice();
                if (d > 0) {
                    return -1;
                } else if (d < 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        for (Product x : P) {
            if (x instanceof AircConditioner) {
                System.out.println(x);
            }
        }
    }

    public void HighestPrice() {
        int highestprice = 0;
        for (Product x : P) {
            if (x.getPrice() > highestprice) {
                highestprice = x.getPrice();
            }
        }
        for (int i = 0; i < P.size(); i++) {
            if (highestprice == P.get(i).getPrice()) {
                System.out.println(P.get(i).toString());
            }
        }
    }

    public void UpdateInfo() {
        PrintPro();
        boolean check;
        String code;

        do {
            code = Utils.getString("Enter Product's code to Update: ", "Code is not null!");
            if (checkcode(code) >= 0) {
                check = false;
            } else {
                System.out.println("This code is not exist!");
                check = true;
            }
        } while (check == true);
        for (Product x : P) {
            if (code.equals(x.getCode())) {
                if (x instanceof Smartphone) {
                    String Newname = Utils.getString("Enter new name: ", "Name is not null !");
                    x.setName(Newname);
                    String Newbrand = Utils.getString("Enter new brand: ", "Brand is not null !");
                    x.setBrand(Newbrand);
                    String NewRam = Utils.getString("Enter new RAM: ", "Ram is not null !");
                    ((Smartphone) x).setRam(NewRam);
                    String NewCPU = Utils.getString("Enter new CPU: ", "CPU is not null !");
                    ((Smartphone) x).setCPU(NewCPU);
                    String Newsize = Utils.getString("Enter new size: ", "Size is not null !");
                    ((Smartphone) x).setSize(Newsize);
                    int Newprice = Utils.getInt("Enter new Price: ", 0);
                    x.setPrice(Newprice);
                    int Newquantity = Utils.getInt("Enter new Quantity: ", 0);
                    x.setQuantity(Newquantity);
                    System.out.println("UPDATE SUCCESSFULLY!");
                }
                
                if (x instanceof Tivi) {
                    String Newname = Utils.getString("Enter new name: ", "Name is not null !");
                    x.setName(Newname);
                    String Newbrand = Utils.getString("Enter new brand: ", "Brand is not null !");
                    x.setBrand(Newbrand);
                    String Newsize = Utils.getString("Enter new size: ", "Size is not null !");
                    ((Tivi) x).setSize(Newsize);
                    int Newprice = Utils.getInt("Enter new Price: ", 0);
                    x.setQuantity(Newprice);
                    int Newquantity = Utils.getInt("Enter new Quantity: ", 0);
                    x.setQuantity(Newquantity);
                    System.out.println("UPDATE SUCCESSFULLY!");
                }
                
                if (x instanceof AircConditioner) {
                    String Nname = Utils.getString("Enter new name: ", "Name is not null !");
                    x.setName(Nname);
                    String Nbrand = Utils.getString("Enter new brand: ", "Brand is not null !");
                    x.setBrand(Nbrand);
                    String Newpower = Utils.getString("Enter new power: ", "Power is not null !");
                    ((AircConditioner) x).setPower(Newpower);
                    int Nprice = Utils.getInt("Enter new Price: ", 0);
                    x.setPrice(Nprice);
                    int Nquantity = Utils.getInt("Enter new Quantity: ", 0);
                    x.setQuantity(Nquantity);
                    System.out.println("UPDATE SUCCESSFULLY!");
                }
            }
        }
    }

    public void DeletePro() {
        String code;
        boolean check;

        PrintPro();
        do {
            code = Utils.getString("Enter Product's code to Delete: ", "Code is not null!");
            if (checkcode(code) >= 0) {
                check = false;
            } else {
                System.out.println("This product is not exist!");
                check = true;
            }
        } while (check == true);
        for (int i = 0; i < P.size(); i++) {
            if (P.get(i).getCode().equals(code)) {
                P.remove(i);
                System.out.println("DELETE SUCCESSFULLY!");
            }
        }
    }

    public void TotalAmount() {
        int sum;
        int total = 0;

        for (int i = 0; i < P.size(); i++) {
            sum = P.get(i).getPrice() * P.get(i).getQuantity();
            total += sum;
        }
        System.out.println("The total amount of all products: " + total);
    }
}
