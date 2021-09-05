/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeptit;
import java.math.BigInteger;
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
//            long num = sc.nextLong();
            BigInteger num = new BigInteger(sc.next());
            if(isFibo(num)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
    public static boolean isPerfect(BigInteger n){
        BigInteger x = new BigInteger("0");
        x = n.sqrt();
        x = x.multiply(x);
        System.out.println(x);
        return x.equals(n);
       
    }
//    A number is Fibonacci if and only if one or both of (5*n2 + 4) 
//    or (5*n2 – 4) is a perfect square
    public static boolean isFibo(BigInteger n){
        BigInteger four = new BigInteger("4");
        BigInteger five = new BigInteger("5");
        n = n.multiply(n);
        n = n.multiply(five);
//        System.out.println(n);
        return isPerfect(n.subtract(four)) ||
               isPerfect(n.add(four));
    }
}
