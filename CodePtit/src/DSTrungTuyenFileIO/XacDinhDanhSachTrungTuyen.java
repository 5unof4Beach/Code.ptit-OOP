package DSTrungTuyenFileIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class XacDinhDanhSachTrungTuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        long t = Long.parseLong(sc.nextLine());
        Vector<Candidate> res = new Vector<Candidate>();
        for(int i=0;i<t;i++){
            String id = sc.nextLine().trim();
            String name = sc.nextLine().trim();
            double math = Double.parseDouble(sc.nextLine().trim());
            double phy = Double.parseDouble(sc.nextLine().trim());  //sc.nextDouble()
            double chem = Double.parseDouble(sc.nextLine().trim());
            Candidate ca = new Candidate(id,name,math,phy,chem);
            res.add(ca);
        }
        int amount = sc.nextInt();
        res.sort((i1,i2)->Double.compare(i2.getTotalPoint(), i1.getTotalPoint()));
        double stdPoint = res.get(amount - 1).getTotalPoint();
        System.out.printf("%.1f\n",stdPoint);
        for(Candidate i:res){
            i.setStandardPoint(stdPoint);
            i.show2();
        }
        
    }
}



class Candidate {
    private String id,name,state;
    private double math,phy,chem,priorityPoint,totalPoint,standardPoint;
    public Candidate(String id,String name,double math,double phy,double chem){
        this.id = id;
        this.name = stdize(name);
        this.math = math;
        this.chem = chem;
        this.phy = phy;
        setTotalPoint();
    }

    public void setPriorityPoint() {
        String areaCode = this.id.substring(0,3);
        if(areaCode.equals("KV1")) priorityPoint = 0.5;
        else if(areaCode.equals("KV2")) priorityPoint = 1;
        else priorityPoint = 2.5;
    }

    public void setTotalPoint() {
        setPriorityPoint();
        totalPoint = math*2 + phy + chem + priorityPoint;
    }

    public double getTotalPoint() {
        return totalPoint;
    }
    
    public void setStandardPoint(double standardPoint) {
        this.standardPoint = standardPoint;
    }

    public void setState() {
        if(totalPoint >= standardPoint) state = "TRUNG TUYEN";
        else state = "TRUOT";
    }
    
    public void show1(){
        setState();
        double temp = totalPoint - priorityPoint;
        if(priorityPoint - (int)priorityPoint == 0 && temp - (int)temp == 0)
            System.out.printf("%s %s %d %d %s\n",id,name,(int)priorityPoint,(int)temp,state);
        else if(priorityPoint - (int)priorityPoint == 0 && temp - (int)temp != 0)
            System.out.printf("%s %s %d %.1f %s\n",id,name,(int)priorityPoint,temp,state);
        else if(priorityPoint - (int)priorityPoint != 0 && temp - (int)temp == 0)
            System.out.printf("%s %s %.1f %d %s\n",id,name,priorityPoint,(int)temp,state);
        else 
            System.out.printf("%s %s %.1f %.1f %s\n",id,name,priorityPoint,temp,state);
    }
    
    public void show2(){
        setState();
        double temp = totalPoint ;
        if(priorityPoint - (int)priorityPoint == 0 && temp - (int)temp == 0)
            System.out.printf("%s %s %d %d %s\n",id,name,(int)priorityPoint,(int)temp,state);
        else if(priorityPoint - (int)priorityPoint == 0 && temp - (int)temp != 0)
            System.out.printf("%s %s %d %.1f %s\n",id,name,(int)priorityPoint,temp,state);
        else if(priorityPoint - (int)priorityPoint != 0 && temp - (int)temp == 0)
            System.out.printf("%s %s %.1f %d %s\n",id,name,priorityPoint,(int)temp,state);
        else 
            System.out.printf("%s %s %.1f %.1f %s\n",id,name,priorityPoint,temp,state);
    }
    
    private String stdize(String name){
        String[] temp = name.toLowerCase().split("\\s+");
        String res = "";
        for(String i:temp){
            res += i.substring(0,1).toUpperCase() + i.substring(1) + " ";
        }
        return res.trim();
    }
}
