package sophuc;
import java.util.*;

public class Nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            sc.nextLine();
            Complex res = new Complex();
            Complex A = new Complex(a,b);
            Complex B = new Complex(c,d);
            res = A.sum(B);
            res = res.mul(A);
            res.show();
            res = A.sum(B);
            System.out.print(", ");
            res = res.mul(res);
            res.show();
            System.out.println("");
        }
    }
}
