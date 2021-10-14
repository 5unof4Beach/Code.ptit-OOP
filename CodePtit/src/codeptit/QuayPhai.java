package codeptit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class QuayPhai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while(t-->0){
            int n = Integer.parseInt(sc.next());
            long res = 0;
            boolean check = true;
            long a[] = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
                if(i!=0 && check){
                    if(a[i-1] > a[i]){
                        res = i;
                        check = false;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
