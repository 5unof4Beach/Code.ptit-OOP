package tinh_luong_nhan_vien;

/**
 *
 * @author suckm
 */
public class Office {
    private String fullName,id,name;

    public Office(String fullName) {
        String a[] = fullName.split(" ",2);
        this.id = a[0];
        this.name = a[1];
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
}
