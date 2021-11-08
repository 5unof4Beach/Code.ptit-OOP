package TinhGioChuanGiangVien;

/**
 *
 * @author suckm
 */
public class Subject {
    private String id,name;

    public Subject(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void show(){
        System.out.printf("%s",name);
    }
}
