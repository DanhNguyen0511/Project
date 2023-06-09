package TDO;

/**
 *
 * @author beche
 */
public class Student {
    private String code;
    private String name;
    private int mark;

    public Student(String code, String name, int mark) {
        this.code = code;
        this.name = name;
        this.mark = mark;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    public String toString(){
        return this.getCode() + " - " + this.getName() + " - " + this.getMark();
        
    }
}
