package phuho;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class XetTuyenPhuHo {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        Vector<Worker> res = new Vector<Worker>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            String name = sc.nextLine().trim();
            String dob = sc.nextLine().trim();
            double theory = Double.parseDouble(sc.nextLine().trim());
            double practice = Double.parseDouble(sc.nextLine().trim());
            Worker wo = new Worker(i, name, dob, theory, practice);
            res.add(wo);
        }
//        res.sort((i1,i2)->Long.compare(i2.getTotalPointInInt(), i1.getTotalPointInInt()));
        for(Worker i:res){
            i.show();
        }
    }
}


class Worker {
    private String name,id,rank;
    private Date dob;
    private int age;
    private double theoryPoint,practicePoint,avg,prize,totalPoint;
    private long totalPointInInt;
    public Worker(int i,String name,String dob,double tPoint,double pPoint) throws ParseException{
       if(i<10) this.id = "PH0" + i;
       else this.id = "PH" + i;
       this.name = stdize(name);
       this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
       this.theoryPoint = tPoint;
       this.practicePoint = pPoint;
       setAvg();
       setPrize();
       setTotalPoint();
       setRank();
       setAge();
    }
    
    private String stdize(String name){
        String[] temp = name.toLowerCase().split("\\s+");
        String res = "";
        for(String i:temp){
            res += i.substring(0,1).toUpperCase() + i.substring(1) + " ";
        }
        return res.trim();
    }
    
    private void setAvg(){
        avg = (practicePoint + theoryPoint)/2;
    }

    public long getTotalPointInInt() {
        return totalPointInInt;
    }
    
    private void setPrize(){
        if(theoryPoint >=8 && practicePoint >=8) prize = 1;
        else if(theoryPoint >=7.5 && practicePoint >=7.5) prize = 0.5;
        else prize = 0;
    }
    
    private void setTotalPoint(){
       totalPoint = avg + prize;
       if(totalPoint > 10) totalPoint = 10;
       totalPointInInt = Math.round(totalPoint);
    }

    public void setRank() {
        if(totalPointInInt == 9 || totalPointInInt == 10) rank = "Xuat sac";
        else if(totalPointInInt == 8) rank = "Gioi";
        else if(totalPointInInt == 7) rank = "Kha";
        else if(totalPointInInt >= 5 && totalPointInInt <=6) rank = "Trung binh";
        else rank = "Truot";
    }

    public void setAge() {
        this.age = 2021 - dob.getYear() - 1900;
    }
    
    public void show(){
        System.out.printf("%s %s %d %d %s\n",id,name,age,totalPointInInt,rank);
    }
    
}

