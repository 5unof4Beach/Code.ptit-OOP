/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeptit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class SapXepChonNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long temp;
        int c=0;
        String res[] = new String[100];
        long[] arr = new long[n];
        // nhap mang
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextLong();
        }
//        Arrays.sort(arr);
        // cai dat thuat toan selecton sort
        int min;
        for(int i=0;i<n-1;i++){
            min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            // doi vi tri
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            
            // in ra man hinh
            c++;
            StringBuilder tmp = new StringBuilder();
            for(long element : arr){
                tmp.append(element);
                tmp.append(" ");
            }
            res[i] = tmp.toString();
        }
        for(int i=c-1;i>=0;i--){
            System.out.println("Buoc " + (i+1) + ": " + res[i]);
        }
    }
}
