package lopchucvu;
import java.util.*;

public class BaiToanTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
        Vector<Employee> res = new Vector<Employee>();
//        for(int i=1;i<=n;i++){
            String name = sc.nextLine();
            long daySalary = sc.nextLong();
            long worksDays = sc.nextLong();
            sc.nextLine();
            String pos = sc.nextLine();
            Employee em = new Employee(1,name,daySalary,worksDays,pos);
            res.add(em);
//        }
        long total = 0;
        for(Employee i:res){
            i.show2();
            total += i.getFinalPay();
        }
//        System.out.println("Tong chi phi tien luong: "+total);
    }
}
