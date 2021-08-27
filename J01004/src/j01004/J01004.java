/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01004;
import java.util.*;
/**
 *
 * @author suckm
 */
public class J01004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            
            int n = sc.nextInt();
            if(isPrime(n)) System.out.println("YES");
            else System.out.println("NO");
            
            
        }
        
    }
    
    public static boolean isPrime(int n)
    {
        if(n<2) return false;
        for(int i = 2;i<= Math.sqrt(n);i++)
            if(n % i == 0) return false;
        return true;
    }
    
}
