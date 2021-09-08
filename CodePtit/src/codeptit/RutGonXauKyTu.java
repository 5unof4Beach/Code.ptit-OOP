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
public class RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        StringBuilder str = new StringBuilder(in);
        
        boolean flag = true;
        while(flag){
            flag = false; // bien kiem tra su ton tai cua phan tu bi lap
            int i = str.length()-1;
            while(i > 0){
                if( str.charAt(i) == str.charAt(i-1)){
                    flag = true;
                    str.deleteCharAt(i);  //neu hai phan tu giong nhau thi xoa
                    str.deleteCharAt(i-1);// 2 phan tu do di.
                    i -= 2;
                }
                else{
                    i--;
                }
            }
        }
        if(str.toString().equals("")){
            System.out.println("Empty String");
        }
        else{
            System.out.println(str.toString());
        }
        
    }
}
