
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = Integer.parseInt(in.nextLine());
//        ArrayList<SinhVien> s = new ArrayList<>();
//        for (int i=1; i<=n; i++){
//            SinhVien a = new SinhVien(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
//            s.add(a);
//        }
//        int k = Integer.parseInt(in.nextLine());
//        while(k-->0){
////            String Q = new String(in.nextLine());
////            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n", Q.toUpperCase());
////            for (SinhVien o : s) {
////                if(o.getMsv().contains(msv(Q))){
////                    if(o.getLop().charAt(0) == 'E' && (o.getMsv().contains("DCCN") || o.getMsv().contains("DCAT")))
////                        continue;
////                    else
////                        System.out.println(o);
////                }
////            }
//            String temp = in.nextLine();
//            String major = msv(temp);
//            System.out.println("DANH SACH SINH VIEN NGANH " + temp.toUpperCase() + ":");
//            for(SinhVien element:s){
//                if( element.getMsv().contains(major))
//                    if(element.getLop().charAt(0) == 'E' && (major.equals("DCCN")|| major.equals("DCAT"))){
//                        continue;
//                    }
//                    else
//                    System.out.println(element);
//            }
//        }
//    }
//    public static String msv(String Q){
//        Q = Q.toUpperCase();
//        if(Q.equals("KE TOAN"))
//            return "DCKT";
//        else if(Q.equals("CONG NGHE THONG TIN"))
//            return "DCCN";
//        else if(Q.equals("AN TOAN THONG TIN"))
//            return "DCAT";
//        else if(Q.equals("VIEN THONG"))
//            return "DCVT";
//        else
//            return "DCDT";  
////        String temp[] = Q.split(" ");
////        String res = temp[0].substring(0,1).toUpperCase() + temp[1].substring(0,1).toUpperCase();
////        if(res.equals("KT")) return "DCKT";
////        if(res.equals("CN")) return "DCCN";
////        if(res.equals("AT")) return "DCAT";
////        if(res.equals("VT")) return "DCVT";
////        /*if(res.equals("DT"))*/ return "DCDT";
//    }
//}
//
//class SinhVien {
//    private String msv, name, lop, email, doanhnghiep;
//    public SinhVien(String msv, String name, String lop, String email) {
//        this.msv = msv;
//        this.name = name;
//        this.lop = lop;
//        this.email = email;
//    }
//   
//    public String getMsv() {
//        return msv;
//    }
//    public String getLop(){
//        return lop;
//    }
//    @Override
//    public String toString(){
//        return  msv +" "+ name +" "+ lop +" "+ email;
//    }
//}

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = "";
        sc.nextLine();
        Integer mat[][] = new Integer[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res += mat[i][j] + " ";
            }
            res += "\n";
        }
        
        System.out.println(res);
    }

}