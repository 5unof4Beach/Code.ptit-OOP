package codeptit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class ThuaSoNguyenTo {
    public static int n = 100000;
    public static long a[] = new long[n];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnst = (int)Math.pow(10, 9);
        int k = sc.nextInt();
        int p = sc.nextInt();
        int second_smallest = p*p;
        long res = p;
        
        n = p;
        a = new long[n];
        sieve();
        if(k == 1){
            System.out.println(res);
        }
        else if(k==2){
            res = second_smallest;
            if(res > cnst){
                System.out.println("0");
            }
            else{
                System.out.println(res);
            }
        }
        else{
//            long temp = getMultiplierOfPreviosPrimes(p);
            res = second_smallest;
            while(k>0){
                res += 2*p;
                for(int i=2;i<p;i++){
                    if(a[i] == 0 && res%i==0){
                        break;
                    }
                }
                if(res > cnst){
                    System.out.println("0");
                    return;
                }
            }
            if(k == 0)
                System.out.println(res);
        }
    }
//    public static long getMultiplierOfPreviousPrimes(long p){
//        long res = 1;
//        long[] a = new long[(int)p+1];
//        Arrays.fill(a, 0);
//        for(int i=2;i<p;i++){
//            if(a[i] == 0){
//                res *= i;
//                for(int j = i*i;j<p;j += i){
//                    a[j] = 1;
//                }
//            }
//        }
//        return res;
//    }  
    public static void sieve(){
        Arrays.fill(a, 0);
        for(int i=2;i<n;i++){
            if(a[i] == 0){
                for(int j = i*i;j<n;j += i){
                    a[j] = 1;
                }
            }
        }
    }  
}
