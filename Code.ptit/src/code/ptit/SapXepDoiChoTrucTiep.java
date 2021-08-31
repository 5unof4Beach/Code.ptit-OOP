/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.ptit;

import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class SapXepDoiChoTrucTiep {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long temp;
        long[] arr = new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextLong();
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    }
                }
                    System.out.print("Buoc " + (i+1) +": ");
                    for(long element : arr){
                        System.out.print(element+" ");
            }
                    System.out.println("\n");
            
            
        }
    }
     
     
//     public static void printArr()
//     {
//         System.out.print("Buoc" + step);
//         for(int i=0;i<n;i++){
//             System.out.println("");
//         }
//     }
    
}
