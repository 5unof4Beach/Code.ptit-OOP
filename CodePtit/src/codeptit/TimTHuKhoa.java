package codeptit;
import java.util.*;
public class TimTHuKhoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Student> res = new Vector<Student>();
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            String name = sc.nextLine();
            String dob = sc.nextLine();
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            sc.nextLine();
            Student st = new Student(i,name,dob,a,b,c);
            res.add(st);
        }
        res.sort((i1,i2)->Double.compare(i2.getTotalPoint(), i1.getTotalPoint()));
        for(Student i:res){
            if(i.getTotalPoint() == res.firstElement().getTotalPoint())
                i.show();
        }
    }
}

class Student{
    private String name,dob;
    private double totalPoint;
    private int id;

    public Student(int id,String name, String dob, double a, double b, double c) {
        this.name = name;
        this.dob = dob;
        this.id = id;
        this.totalPoint = a + b + c;
    }

    public double getTotalPoint() {
        return totalPoint;
    }
    public void show(){
        System.out.printf("%d %s %s %.1f\n",id,name,dob,totalPoint);
    }
}
