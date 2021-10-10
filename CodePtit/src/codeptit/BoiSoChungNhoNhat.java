package codeptit;

import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author suckm
 */
public class BoiSoChungNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String a = sc.next(),b = sc.next();
            BigInteger A = new BigInteger(a);
            BigInteger B = new BigInteger(b);
            BigInteger C = A.gcd(B);
            A = A.multiply(B);
            System.out.println(A.divide(C));
        }
    }
}
