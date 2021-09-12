package bangdiem;

import java.util.Scanner;

public class HocSinh {
    private double avg;
    private int id;
    private String name;
    
    public HocSinh(int id,Scanner sc){
        this.name = sc.nextLine();
        this.id = id;
        setAvg(sc);
    }
    public void setAvg(Scanner sc){
        double sum = 0,temp=0;
        for(int i=0;i<10;i++){
            temp = sc.nextDouble();
            if(i==0 || i==1){
                sum += temp * 2;
            }
            else sum += temp;
        }
        sc.nextLine();
        avg = sum/12;
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
