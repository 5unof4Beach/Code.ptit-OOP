package codeptit;
import java.util.*;
public class BangXepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Student> res = new Vector<Student>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name = sc.nextLine();
            int ac = sc.nextInt();
            int sub = sc.nextInt();
            sc.nextLine();
            Student st = new Student(name,ac,sub);
            res.add(st);
        }
        res.sort((i1,i2)->i1.getName().compareTo(i2.getName()));
        res.sort((i1,i2)->Integer.compare(i1.getSub(), i2.getSub()));
        res.sort((i1,i2)->Integer.compare(i2.getAc(), i1.getAc()));
        for(Student i:res){
            i.show();
        }
    }
}


class Student{
    private String name;
    private int ac,sub;
    public Student(String name,int ac,int sub){
        this.name = name;
        this.ac = ac;
        this.sub = sub;
    }

    public String getName() {
        return name;
    }

    public int getAc() {
        return ac;
    }

    public int getSub() {
        return sub;
    }
    public void show(){
        System.out.printf("%s %d %d\n",name,ac,sub);
    }
}