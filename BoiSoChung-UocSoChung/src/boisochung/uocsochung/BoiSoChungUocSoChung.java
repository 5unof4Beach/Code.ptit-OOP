/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boisochung.uocsochung;
import java.util.*;
/**
 *
 * @author suckm
 */
public class BoiSoChungUocSoChung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(BCNN(a, b)+" "+UCLN(a, b));
        }
    }
    public static long UCLN(long n1,long n2){
        if(n1 == 0 || n2==0){
            return n1+n2;
        }
        while(n1 != n2){
            if(n1>n2){
                n1 -= n2;
            }
            else{
                n2 -= n1;
            }
        }
        return n1;
    }
    public static long BCNN(long n1,long n2){
        return (n1 * n2)/UCLN(n1, n2);
    }
}
