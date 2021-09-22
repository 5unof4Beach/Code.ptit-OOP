package bai1;
import java.util.*;
/**
 *
 * @author suckm
 */
public class GiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long temp = 1;
        long res = 0;
        for(int i=1;i<=n;i++){
            temp *= i;
            res += temp;
        }
        System.out.println(res);
    }
}
