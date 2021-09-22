package baitoantuyensinh;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = Long.parseLong(sc.nextLine());
        Vector<Candidate> res = new Vector<Candidate>();
        for(int i=0;i<t;i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            double math = Double.parseDouble(sc.nextLine());
            double phy = Double.parseDouble(sc.nextLine());  //sc.nextDouble()
            double chem = Double.parseDouble(sc.nextLine());
            Candidate ca = new Candidate(id,name,math,phy,chem);
            res.add(ca);
        }
//        int amount = sc.nextInt();
        res.sort((i1,i2)->i1.getId().compareTo(i2.getId()));
        res.sort((i1,i2)->Double.compare(i2.getTotalPoint(), i1.getTotalPoint()));
        for(Candidate i:res){
            i.setStandardPoint(24);
            i.show2();
        }
        //In danh sach trung tuyen
//        double stdPoint = res.get(amount - 1).getTotalPoint();
//        System.out.printf("%.1f\n",stdPoint);
//        for(Candidate i:res){
//            i.setStandardPoint(stdPoint);
//            i.show2();
//        }
        
    }
}



class Candidate {
    private String id,name,state;
    private double math,phy,chem,priorityPoint,totalPoint,standardPoint;
    public Candidate(String id,String name,double math,double phy,double chem){
        this.id = id;
        this.name = name;
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

    public String getId() {
        return id;
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
}
