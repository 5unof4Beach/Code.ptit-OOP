package nhan_vien_van_phong_J05065;

import java.util.*;
public class LietKeNhanVienTheoNhoms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Employee> res = new Vector<Employee>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String temp[] = s.split(" ",2);
            Employee ep = new Employee(temp[0], temp[1]);
            res.add(ep);
        }
        int gd = 1,tp=3,pp=3;
        for(Employee i:res){
            if(i.getPos().equals("GD")){
                if(gd <= 0){
                    i.setPos("NV");
                }
                gd--;
            }
            else if(i.getPos().equals("TP")){
                if(tp<=0){
                    i.setPos("NV");
                }
                tp--;
            }
            else if(i.getPos().equals("PP")){
                if(tp<=0){
                    i.setPos("NV");
                }
                pp--;
            }
        }
        
        res.sort((i1,i2) -> i1.getNumber().compareTo(i2.getNumber()));
        res.sort((i1,i2) -> i2.getSalaryRank().compareTo(i1.getSalaryRank()));
        
        int q = sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String pos = sc.nextLine();
            for(Employee i:res){
                if(i.getPos().equals(pos)){
                    i.show();
                }
            }
            System.out.println("");
        }
    }
}
