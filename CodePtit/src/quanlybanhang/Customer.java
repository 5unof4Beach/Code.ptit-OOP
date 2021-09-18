package quanlybanhang;

/**
 *
 * @author suckm
 */
public class Customer {
    private String ID,name,gender,dob,address;

    public Customer(int id, String name, String gender, String dob, String address) {
        if(id<10) ID = "KH00" + id;
        else ID = "KH0" + id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getID() {
        return ID;
    }
    
    
}
