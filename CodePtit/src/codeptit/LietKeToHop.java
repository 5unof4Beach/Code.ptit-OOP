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
public class LietKeToHop {
    public static int n,k,count;
    public static int x[] = new int[100];
    public static boolean last = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int c = 0;
        init();
        while(!last){
            print();
            generate();
            c++;
        }
        System.out.println("Tong cong co " + c + " to hop");
    }
    
    public static void init(){
        for(int i=1;i<=k;i++) x[i] = i;
    }
    
    public static void generate(){
        int i = k;
        while( i>0 && x[i] == n - k + i){
            i--;
        }
        if( i == 0){
            last = true;
        }
        else{
            x[i] = x[i]+1;
            for(int j = i+1;j<=n;j++){
                x[j] = x[i] + j - i;
            }
        }
    }
    
    public static void print(){
        for(int i = 1;i <=k;i++){
            System.out.print(x[i] + " ");
        }
        System.out.println("");
    }
}
