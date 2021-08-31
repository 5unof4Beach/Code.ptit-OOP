/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.ptit;
import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author suckm
 */
public class TongSoNguyenLon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-->0)
//        {
//            
//        }
        String a = sc.next(),b = sc.next();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        System.out.println(A.subtract(B));
        
    }
    
}
