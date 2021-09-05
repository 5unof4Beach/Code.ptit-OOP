/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeptit;

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
        long val;
        int hole;
        for(int i=1;i<n;i++){
            val = arr[i];
            hole = i;
            print(i, arr);
            while(hole > 0 && arr[hole - 1] > val)
            {
                arr[hole] = arr[hole - 1];
                hole--;
            }
            arr[hole] = val;
        }
      
        print(n, arr);
    }
    
    public static void print(int count,long arr[]){
        System.out.print("Buoc " + (count - 1) + ": ");
        for(int i = 0;i<count;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
