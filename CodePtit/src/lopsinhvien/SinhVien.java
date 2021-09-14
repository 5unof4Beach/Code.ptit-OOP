package lopsinhvien;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class SinhVien {
    private String name,lop,email,strID,year;
    private Date dob;
    private int stuID;
    private float gpa;
    
    public SinhVien(){
        this.stuID = 0;
        this.name = "";
        this.lop = "";
        this.dob = null;
        this.gpa = 0;
    }
    
    public SinhVien(int id,String name,String lop,String dob,float gpa) throws ParseException{
        this.stuID = id;
//        lowercase và trim ngay tại đây
        this.name = name.toLowerCase().trim();
        this.lop = lop;
        Date temp = new SimpleDateFormat("dd/mm/yyyy").parse(dob);
        this.dob = temp;
        this.gpa = gpa;
    }
    
    public SinhVien(String id,String name,String lop,String email) throws ParseException{
        this.strID = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getYear() {
        String temp = lop.substring(1,3);
        this.year = "20"+ temp;
        return year;
    }

    public String getName() {
        return name;
    }

    public String getStrID() {
        return strID;
    }

    public void setName(String name) {
        String edit[] = name.split("\\s+");
        String temp = "";
        for(int i=0;i<edit.length;i++){
            if(i != edit.length - 1)
                temp += edit[i].substring(0, 1).toUpperCase() + edit[i].substring(1) + " ";
            else
                temp += edit[i].substring(0, 1).toUpperCase() + edit[i].substring(1);
        }
        this.name = temp;
    }

    public String getLop() {
        return lop;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStrID(String strID) {
        this.strID = strID;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    
    
    
    public void setStuID(int stuID) {
        this.stuID = stuID;
    }
        
    
    public String toString() {
        String temp = "";
        if(this.stuID < 10){
            temp += "00" + this.stuID;
        }
        else{
            temp += "0" +this.stuID;
        }
        temp = "B20DCCN" + temp;
        setName(name);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        String date = formatter.format(this.dob);
        return String.format("%s %s %s %s %.2f", temp, name, lop, date, gpa);
    }
    
    public void show(){
        
        System.out.printf("%s %s %s %s\n",strID,name,lop,email);
    }
    
    
}
