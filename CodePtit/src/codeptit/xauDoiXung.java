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
public class xauDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String str = sc.nextLine();
            if( DX(str) ){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
    public static boolean DX(String n){
        int count =  0;
        for(int i=0; i<(int)(n.length()/2);i++){
            if( n.charAt(i) != n.charAt(n.length() - i -1)){
                count ++ ;
            }
        }
//      kiem tra xem do dai xau co le khong,neu le thi thay doi phan tu giua 
        if( n.length() % 2 == 1 && count == 0) return true;
        if(count == 1) return true;
        return false;
        
    }
}
