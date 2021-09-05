/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeptit;
import java.util.Scanner;
/**
 *
 * @author suckm
 */
public class SapXepNoiBot {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        int count = 1;
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0 ; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = 0;i<n;i++){
            flag = 0;
            for(int j=0;j<n-1;j++){
                if( a[j] > a[j+1] ){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = 1; 
                }
            }
            if(flag == 1){
                System.out.print("Buoc " + count + ": ");
                count++;
                for(int j= 0 ;j<n;j++){
                    System.out.print(a[j]+" ");
                }
                System.out.println("");
            }
        }
    }
}
