package giao_vien;

import java.util.*;
public class TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        long salary = sc.nextLong();
        Teacher tc = new Teacher(id,name,salary);
        tc.show();
    }
}
