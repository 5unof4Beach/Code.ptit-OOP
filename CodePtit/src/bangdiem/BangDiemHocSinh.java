package bangdiem;
import java.util.*;

public class BangDiemHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<HocSinh> res = new Vector<HocSinh>();
        for(int i = 1;i<=n;i++){
            String name = sc.nextLine();
            double avg = 0;
            for(int j=0;j<10;j++){
                double temp = Double.parseDouble(sc.next());
                if(j == 0 || j==1){
                    avg += temp*2;
                }
                else{
                    avg += temp;
                }
            }
            sc.nextLine();
            HocSinh hs = new HocSinh(i,name,avg/12.0);
            res.add(hs);
            
        }
        res.sort((i1,i2)->Double.compare(i2.getAvg(), i1.getAvg()));
        for(HocSinh element : res){
            element.show();
        }
    }
}


class HocSinh {
    private double avg;
    private int id;
    private String name;
    
    public HocSinh(int id,String name,Double avg){
        this.name = name;
        this.id = id;
        this.avg = avg;
    }
    
    
    public double getAvg(){
        avg = Math.round(avg*10)/10.0;
        return avg;
//        return avg;
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


