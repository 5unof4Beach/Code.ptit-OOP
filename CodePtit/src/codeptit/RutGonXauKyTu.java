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
        Stack<Character> res = new Stack<Character>();
        String str = sc.nextLine();
        int n = str.length();
        String temp = "";
        boolean flag = true;
        while(flag){
            flag = false;
            int i = str.length()-1;
            while(i > 0){
                if( str.charAt(i) == str.charAt(i-1)){
                    flag = true;
                    temp += str.charAt(i);
                    temp += str.charAt(i);
                    str = str.replace(temp, "");
                    i -= 2;
                }
                else{
                    i--;
                }
            }
            System.out.println(str);
        }
//        if(res.empty()){
//            System.out.println("Empty String");
//        }
//        while( !res.empty()){
//            System.out.print(res.pop());
//        } 
        System.out.println(str);
        System.out.println();
    }
}
