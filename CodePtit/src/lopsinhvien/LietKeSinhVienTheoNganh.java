package lopsinhvien;
import java.text.ParseException;
import java.util.*;

public class LietKeSinhVienTheoNganh {
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        Vector<SinhVien> res = new Vector<SinhVien>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien sv = new SinhVien(id,name,lop,email);
            res.add(sv);
            
        }

        int q = Integer.parseInt(sc.nextLine());
        for(int i=0;i<q;i++){
            String temp = sc.nextLine();
            String major = nameFormat(temp);
            System.out.println("DANH SACH SINH VIEN NGANH " + temp.toUpperCase() + ":");
            for(SinhVien element:res){
                if( element.getStrID().contains(major))
                    if(element.getLop().charAt(0) == 'E' && (major.equals("DCCN")|| major.equals("DCAT"))){
                        continue;
                    }
                    else
                    element.show();
            }
        }
    }
    
    public static String nameFormat(String str){
        String temp[] = str.split(" ");
        String res = temp[0].substring(0,1).toUpperCase() + temp[1].substring(0,1).toUpperCase();
        if(res.equals("KT")) return "DCKT";
        if(res.equals("CN")) return "DCCN";
        if(res.equals("AT")) return "DCAT";
        if(res.equals("VT")) return "DCVT";
        /*if(res.equals("DT"))*/ return "DCDT";
    }
}
