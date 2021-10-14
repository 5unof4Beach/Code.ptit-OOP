package codeptit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            BigInteger A = new BigInteger(sc.next());
            BigInteger B = new BigInteger(sc.next());

            if(A.compareTo(B) == -1){
                if(B.remainder(A).longValue() == 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else if(A.compareTo(B) == 1){
                if(A.remainder(B).longValue() == 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
