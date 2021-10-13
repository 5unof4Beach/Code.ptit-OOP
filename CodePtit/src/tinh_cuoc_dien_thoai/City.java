package tinh_cuoc_dien_thoai;

/**
 *
 * @author suckm
 */
public class City {
    private String code,name;
    private int price;

    public City(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    
}
