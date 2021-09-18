package giaovien;

import java.util.*;
public class TuyenGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Candidate> res = new Vector<Candidate>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            String name = sc.nextLine();
            String code = sc.nextLine();
            Double computer = sc.nextDouble();
            Double mainSub = sc.nextDouble();
            sc.nextLine();
            Candidate can = new Candidate(i,name,code,computer,mainSub);
            res.add(can);
        }
        res.sort((i1,i2)->Double.compare(i2.getTotal(), i1.getTotal()));
        for(Candidate i:res){
            i.show();
        }
    }
}


class Candidate {
    private String ID,name,code,subject;
    private double point,computerScience,mainSubject,total,priorityPoint;
    
    public Candidate(int id,String name,String code,Double computer,Double main){
        if(id<10) ID = "GV0" + id;
        else ID = "GV" + id;
        this.name = name;
        this.code = code;
        this.computerScience = computer;
        this.mainSubject = main;
        setPriorityPointAndSubject();
        this.total = computerScience*2.0 + mainSubject + priorityPoint;
        
    }

    public void setPriorityPointAndSubject() {
        if(this.code.charAt(1) == '1') priorityPoint = 2;
        else if(this.code.charAt(1) == '2') priorityPoint = 1.5;
        else if(this.code.charAt(1) == '3') priorityPoint = 1.0;
        else priorityPoint = 0;
        
        if(this.code.charAt(0)=='A') subject = "TOAN";
        else if(this.code.charAt(0)=='B') subject = "LY";
        else subject = "HOA";
    }
    
    private String Ranking(){
        if(total>=18) return "TRUNG TUYEN";
        else return "LOAI";
    }
    
    public double getTotal() {
        return total;
    }
    
    public void show(){
        System.out.printf("%s %s %s %.1f %s\n",ID,name,subject.toUpperCase(),total,Ranking());
    }
}
