package quanlybaitapnhom;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class QuanLyBaiTapNhom {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
//        Vector<Member> res = new Vector<Member>();
        HashMap<String, Member> res = new HashMap<>();
        Vector<String> subject = new Vector<String>();
        for(int i=0;i<n;i++){
            String ID = sc.nextLine();
            String name = sc.nextLine();
            String phone = sc.nextLine();
            Member mem = new Member(ID,name,phone);
//            res.add(mem);
            res.put(ID, mem);
        }
        
        sc = new Scanner(new File("BAITAP.in"));
        int numOfSubject = Integer.parseInt(sc.nextLine());
        for(int i=0;i<numOfSubject;i++){
            String SubName = sc.nextLine();
            subject.add(SubName);
        }
        
        sc = new Scanner(new File("NHOM.in"));
        while(sc.hasNextLine()){
            String[] temp = sc.nextLine().split(" ");
            res.get(temp[0]).setTeam(Integer.parseInt(temp[1]));
            res.get(temp[0]).setSubject(subject.get(Integer.parseInt(temp[1])-1));
        }
        
        Vector<String> v = new Vector<>();
        for(String i:res.keySet()){
            v.add(i);
        }
        Collections.sort(v);
        for(String i:v){
            res.get(i).show2();
        }
    }
}


class Member {

    private String ID, name, phoneNum,subject;
    private int team;

    public Member(String ID, String name, String phoneNum, int team) {
        this.ID = ID;
        this.name = name;
        this.phoneNum = phoneNum;
        this.team = team;
    }
    public Member(String ID, String name, String phoneNum) {
        this.ID = ID;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public String getID() {
        return ID;
    }

    public int getTeam() {
        return team;
    }

    public void show() {
        System.out.printf("%s %s %s \n", ID, name, phoneNum);
    }
    
    public void show2() {
        System.out.printf("%s %s %s %d %s\n", ID, name, phoneNum,team,subject);
    }
}
