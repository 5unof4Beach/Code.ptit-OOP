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
public class ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-->0){
            
            BigInteger a = new BigInteger(sc.next());
            BigInteger eleven = new BigInteger("11");
    //        System.out.println(a.mod(eleven).toString());
            if(a.mod(eleven).toString() == "0"){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
