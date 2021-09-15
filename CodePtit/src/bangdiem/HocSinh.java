package bangdiem;

import java.util.Scanner;

public class HocSinh {
    private double avg;
    private int id;
    private String name;
    
    public HocSinh(int id,String name,Double avg){
        this.name = name;
        this.id = id;
        this.avg = avg;
    }
    
    
    public double getAvg(){
        return avg;
    }
    
    public String ranking(double avg){
        if(avg >= 9) return "XUAT SAC";
        else if(avg >= 8) return "GIOI";
        else if(avg >= 7) return "KHA";
        else if(avg >= 5) return "TB";
        else return "YEU";
    }
    
    public String toString(){
        String ID = "";
        if(id<10) ID = "0" + id;
        else ID += id;
        
        return String.format("HS%s %s %.1f %s",ID,name,avg,ranking(avg));
    }
    
    public void show(){
        System.out.println(toString());
    }
    
}
