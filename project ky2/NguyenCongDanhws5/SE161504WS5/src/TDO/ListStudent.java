package TDO;

import MyUtils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author beche
 */
public class ListStudent {

    ArrayList<Student> list = new ArrayList<>();

    public void AddStudent() {
        String code;
        String name;
        int mark;
        boolean check = true;
        do {
            code = Utils.getStringreg("Enter Student's code: ", "^S\\d{3}$", "Code is not blank!", "Student code must be in format <S000>");
            if (uniquecode(code) >= 0) {
                System.out.println("This code is exist!");
            } else {
                check = false;
            }
        } while (check);
        name = Utils.getString("Enter Student's name: ", "Name is not blank!");
        mark = Utils.getInt("Enter Student's mark: ", 0, 10);

        list.add(new Student(code, name, mark));
        System.out.println("ADD A STUDENT SUCCESSFULLY!");
    }

    public int uniquecode(String code) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(code)) {
                return i;
            }
        }
        return -1;
    }

    public void SearchStudent() {
        Scanner sc = new Scanner(System.in);
        String code;

        boolean check = true;
        do {
            code = Utils.getString("Enter Student's code to Search: ", "Code is not blank!!");
            if (uniquecode(code) < 0) {
                System.out.println("This code is not exist!");
            } else {
                check = false;
            }
        } while (check);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(code)) {
                System.out.println(list.get(i));
            }
        }
    }

    public void UpdateStu() {
        String code;
        boolean check = true;
        
        ListAll();
        do {
            code = Utils.getString("Enter Student's code to Update: ", "Code is not blank!!");
            if (uniquecode(code) < 0) {
                System.out.println("This code is not exist!");
            } else {
                check = false;
            }
        } while (check);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(code)) {
                String Nname = Utils.getString("Enter new name: ", "Name is not blank!");
                list.get(i).setName(Nname);
                int Nmark = Utils.getInt("Enter Student's mark: ", 0, 10);
                list.get(i).setMark(Nmark);
                System.out.println("UPDATE SUCCESSFULLY!");
            }
        }
    }

    public void RemoveStudent() {
        String code;
        boolean check = true;
        
        ListAll();
        do {
            code = Utils.getString("Enter Student's code to Remove: ", "Code is not blank!!");
            if (uniquecode(code) < 0) {
                System.out.println("This code is not exist!");
            } else {
                check = false;
            }
        } while (check);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(code)) {
                list.remove(i);
                System.out.println("REMOVE SUCCESSFULLY!");
            }
        }
    }

    public void ListAll() {
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
