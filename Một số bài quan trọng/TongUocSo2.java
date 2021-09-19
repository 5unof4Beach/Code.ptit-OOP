package codeptit;
import java.util.Arrays;
import java.util.Scanner;
// https://www.geeksforgeeks.org/sum-factors-number/
public class TongUocSo2 {
    public static int Prime_set[] = new int[200000];
    public static boolean num[] = new boolean[2000006];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
        sieve();
        for(int i = start;i<=end;i++){
            if(sumofFactorsExceptItself(i)>i) count++;
        }
            System.out.println(count);
    }
    
    static int sumofFactorsExceptItself(int n)
    {
        int temp = n;
        int res = 1;
      
        int pos = 0;
        while(n != 1){
            int  curr_sum = 1;
            int curr_term = 1;
            if(num[n]){
                curr_term *= n;
                curr_sum += curr_term;
                res *= curr_sum;
                n/=n;
                break;
            }
            while(n % Prime_set[pos] == 0){
                curr_term *= Prime_set[pos];
                curr_sum += curr_term;
                n /= Prime_set[pos];
                }
            pos++;
            res *= curr_sum;    
        }
     
        return res - temp ;
    }
    
    public static void sieve(){
        Arrays.fill(num,true);
        num[0] = false;
        num[1] = false;
        int pos = 0;
        for(int i=2;i*i<2000006;i++){
            if(num[i]){
                Prime_set[pos] = i;
                pos++;
                for(int j=i*i;j<2000006;j += i){
                    num[j] = false;
                }
            }
        }
    }
}
