package codeptit;
import java.util.*;
/**
 *
 * @author suckm
 */
public class KiemTraSoFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long num = sc.nextLong();
            if(isFibo(num)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
//    A number is Fibonacci if and only if one or both of (5*n2 + 4) 
//    or (5*n2 – 4) is a perfect square
    public static boolean isFibo(long n){
//        neu < 2 thi la fibo
        if(n<2) return true;
        long sum = 0;
        long f1 = 1;
        long f2 = 1;
        while(sum <= n){
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
            if(sum == n) return true;
        }
        return false;
        
    }
}
