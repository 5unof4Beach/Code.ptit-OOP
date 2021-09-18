package tuyendung;

import java.util.*;
public class TuyenDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Candidates> res = new Vector<Candidates>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            String name = sc.nextLine();
            Double theory = sc.nextDouble();
            Double practice = sc.nextDouble();
            sc.nextLine();
            Candidates can = new Candidates(i,name,theory,practice);
            res.add(can);
        }
        res.sort((i1,i2)->Double.compare(i2.getAvg(), i1.getAvg()));
        for(Candidates i:res){
            i.show();
        }
    }
}


class Candidates {
    private String ID,name;
    private double point,theoryPoint,practicePoint,avg;
    public Candidates(int id,String name,Double theory,Double practice){
        if(id<10) ID = "TS0" + id;
        else ID = "TS" + id;
        this.name = name;
        this.theoryPoint = standardize(theory);
        this.practicePoint = standardize(practice);
        this.avg = (theoryPoint + practicePoint)/2.0;
        
    }
    public double standardize(double point){
        if( point > 10 ){
            return point/10.0;
        }
        return point;
    }
    
    private String Ranking(){
        if(avg>9.5) return "XUAT SAC";
        else if(avg>=8.0) return "DAT";
        else if(avg>=5.0) return  "CAN NHAC";
        else return "TRUOT";
    }
    
    public double getAvg() {
        return avg;
    }
    
    public void show(){
        System.out.printf("%s %s %.2f %s\n",ID,name,avg,Ranking());
    }
}

