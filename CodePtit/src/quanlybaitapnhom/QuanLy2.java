package quanlybaitapnhom;
import java.util.*;

public class QuanLy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numOfSubject = sc.nextInt();
        sc.nextLine();
        Vector<Member> res = new Vector<Member>();
        Vector<String> subject = new Vector<String>();
        for(int i=0;i<n;i++){
            String ID = sc.nextLine();
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
        
        res.sort( (i1,i2) -> i1.getID().compareTo(i2.getID()));
        for(Member i:res){
            i.setSubject(subject.elementAt(i.getTeam()-1));
            i.show2();
        }
        
    }
}
