package codeptit;
import java.util.*;
/**
 *
 * @author suckm
 */
public class BoBaSoPytago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            if(check(n, arr)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    
     public static boolean check(int n, long[] arr){
        for(int i = 0; i < n; i++)
            arr[i] = arr[i] * arr[i];
        Arrays.sort(arr);
        for(int i=n-1; i>=2; i--){
            int l = 0, r = i;
            while(l < r){
                if(arr[l] + arr[r] == arr[i])
                    return true;
                if(arr[l] + arr[r] < arr[i])
                    l++;
                else
                    r--;
            }
        }
        return false;
    }
}
