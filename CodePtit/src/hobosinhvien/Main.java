package hobosinhvien;
import java.util.*;
/**
 *
 * @author suckm
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Student> toSort = new Vector<Student>();
        Vector<Student> res = new Vector<Student>();
        int t = sc.nextInt();
        int amount  = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String name = sc.nextLine();
            double gpa = sc.nextDouble();
            int rl = sc.nextInt();
            sc.nextLine();
            Student st = new Student(name,gpa,rl);
            res.add(st);
            toSort.add(st);
        }
        toSort.sort((i1,i2)->Double.compare(i2.getGpa(), i1.getGpa()));
        double stdGpa = toSort.elementAt(amount - 1).getGpa();
        for(Student i:res){
            if(i.getGpa() >= stdGpa){
                i.show();
            }
            else{
                i.setRank("KHONG");
                i.show();
            }
        }
        
    }
}

class Student{
    private String name,rank;
    private double gpa;
    private int rl;

    public Student(String name, double gpa, int rl) {
        this.name = name;
        this.gpa = gpa;
        this.rl = rl;
        setRank();
    }
    
    private void setRank(){
        if(gpa>=3.6 && rl>=90){
            rank = "XUATSAC";
        }
        else if(gpa>=3.2 && rl>=80){
            rank = "GIOI";
        }
        else if(gpa>=2.5 && rl>=70){
            rank = "KHA";
        }
        else rank = "KHONG";
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public void show(){
        System.out.printf("%s: %s\n",name,rank);
    }
}
