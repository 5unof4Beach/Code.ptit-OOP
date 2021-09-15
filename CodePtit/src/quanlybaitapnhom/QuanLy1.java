package quanlybaitapnhom;
import java.util.*;

public class QuanLy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numOfSubject = sc.nextInt();
        sc.nextLine();
        Vector<Member> res = new Vector<Member>();
        Vector<String> subject = new Vector<String>();
        for(int i=0;i<n;i++){
            String ID = sc.nextLine();
//            System.out.println(ID);
            String name = sc.nextLine();
            String phone = sc.nextLine();
            int team = Integer.parseInt(sc.nextLine());
            Member mem = new Member(ID,name,phone,team);
            res.add(mem);
        }
        
        for(int i=0;i<numOfSubject;i++){
            String SubName = sc.nextLine();
            subject.add(SubName);
        }
        int q = Integer.parseInt(sc.next());
        for(int i=0;i<q;i++){
            int input = Integer.parseInt(sc.next());
            System.out.printf("DANH SACH NHOM %d:\n",input);
            for(Member k:res){
                if(k.getTeam() == input){
                    k.show();
                }
            }
            System.out.printf("Bai tap dang ky: %s\n",subject.elementAt(input-1));
        }
        
    }
}
