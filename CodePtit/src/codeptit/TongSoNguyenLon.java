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
public class TongSoNguyenLon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String a = sc.next(),b = sc.next();
            BigInteger A = new BigInteger(a);
            BigInteger B = new BigInteger(b);
//            System.out.println(A.add(B));
            String temp = A.subtract(B).abs().toString();
//            System.out.println(temp);
            int l = 0;
            if(a.length() < b.length()){
                l = b.length();
            }
            else{
                l = a.length();
            }
            if(temp.length() < l){
                for(int i = 0 ; i< l - temp.length();i++)
                    System.out.print(0);
            }
            System.out.println(temp);
//            
          }
        
    }
}
