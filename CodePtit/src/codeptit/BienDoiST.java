package codeptit;

import java.util.*;

/**
 *
 * @author suckm
 */
public class BienDoiST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            int s = sc.nextInt();
            int t = sc.nextInt();
            sc.nextLine();
            int res = 0;
            if(s >= t){
                System.out.println(s-t);
            }
            else{
                while(s<t){
                    s *= 2;
                    res++;
                }
                while(s>t){
                    s--;
                    res++;
                }
                System.out.println(res);
            }
        }
    }
}
