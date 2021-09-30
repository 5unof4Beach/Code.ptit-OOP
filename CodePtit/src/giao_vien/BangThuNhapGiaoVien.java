package giao_vien;

import java.util.*;

public class BangThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int ht = 1, hp = 2;
        while(t-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            long salary = sc.nextLong();
            sc.nextLine();
            Teacher tc = new Teacher(id,name,salary);
            if(tc.getPos().equals("HT") ){
                if(ht>0){
                    tc.show();
                    ht--;
                }
            }
            else if(tc.getPos().equals("HP")){
                if(hp>0){
                    tc.show();
                    hp--;
                }
            }
            else
                tc.show();
        }
    }
}
