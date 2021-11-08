package DanhSachSinhVienTrongFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author suckm
 */
public class Student {
    private Date dob;
    private String id,name,cl;
    private float gpa;

    public Student(int i, String name, String cl, String dob, float gpa) throws ParseException {
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.id = String.format("B20DCCN%03d", i);
        this.name = standardize(name.trim().toLowerCase());
        this.cl = cl;
        this.gpa = gpa;
    }
    
    public void show(){
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("%s %s %s %s %.2f\n",id,name,cl,f.format(dob),gpa);
    }
    
    public String standardize(String s){
        String res = "";
        String tmp[] = s.trim().split("\\s+");
        for(String i:tmp){
            String temp = i.substring(0,1).toUpperCase() + i.substring(1) + " ";
            res += temp;
        }
        return res.trim();
    }
}
