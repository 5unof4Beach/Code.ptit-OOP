/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.ptit;

import java.util.*;

/**
 *
 * @author suckm
 */
public class SapXepChen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long temp;
        long[] arr = new long[n];
        // nhap mang
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextLong();
        }
        
        // cai dat thuat toan insertion sort
        long val,hole;
        Vector<long> b = null;
        for(int i=0;i<n;i++)
        {
            b.add(arr[i]);
        }
            // in ra man hinh
            System.out.print("Buoc " + (i+1) +": ");
            for(long element : arr){
                System.out.print(element+" ");
            }
            System.out.println("\n");
            
    }
    
    
    
}
