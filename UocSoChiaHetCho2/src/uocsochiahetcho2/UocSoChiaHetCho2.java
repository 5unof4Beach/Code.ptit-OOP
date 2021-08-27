/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uocsochiahetcho2;

import java.util.*;

/**
 *
 * @author suckm
 */
public class UocSoChiaHetCho2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            
            int c = 1;
            int temp =2;
            long n = sc.nextLong();
            if(n % 2 == 1) 
                System.out.println("0");
            else{
                for(long i = 2;i<=n/2;i+=2){
                    if(n%i==0)
                        c++;
                }
                System.out.println(c);
            }
        }
        
        
    }
    
}
