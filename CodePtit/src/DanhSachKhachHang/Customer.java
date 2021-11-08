package DanhSachKhachHang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author suckm
 */
public class Customer {
    private String name, gender, add, id;
    private Date dob;

    public Customer(int i, String name, String gender, String dob, String add) throws ParseException {
        id  = String.format("KH%03d",i);
        this.name = standardize(name);
        this.gender = gender;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.add = add;
    }
    
    public long getAge(){
        return dob.getTime();
    }
    
    public String standardize(String s){
        String res = "";
        String tmp[] = s.trim().toLowerCase().split("\\s+");
        for(String i:tmp){
            String temp = i.substring(0,1).toUpperCase() + i.substring(1) + " ";
            res += temp;
        }
        return res.trim();
    }
    
    public void show(){
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("%s %s %s %s %s\n",id, name, gender, add, f.format(dob));
    }
}
