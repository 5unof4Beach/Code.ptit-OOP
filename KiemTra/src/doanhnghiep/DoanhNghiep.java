package doanhnghiep;

/**
 *
 * @author suckm
 */
public class DoanhNghiep {
    private String id, name;
    private int student;

    public DoanhNghiep(String id, String name, int student) {
        this.id = id;
        this.name = name;
        this.student = student;
    }

    public String getId() {
        return id;
    }
    public void show(){
        System.out.printf("%s %S %d\n", id, name, student);
    }
}
