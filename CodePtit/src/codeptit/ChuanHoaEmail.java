/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this emaillate file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeptit;
import java.util.*;
/**
 *
 * @author suckm
 */
public class ChuanHoaEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email="";
        int c = 0;
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            email += XuLy(s, email) + " ";
            System.out.println("@ptit.edu.vn");
        }
    }
    
    public static String XuLy(String s,String email){
        s = s.trim();
        String arr[] = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        res.append(arr[arr.length-1].toLowerCase());
        for(int i=0;i<arr.length -1 ;i++){
            res.append(Character.toLowerCase(arr[i].charAt(0)));
        }
        int count = 1;
        String a = res.toString().trim();
        // dem xem ten da xuat hien chua
        String temp[] = email.split(" ");
        for(int i=0;i<temp.length;i++){
            if(a.equals(temp[i])){
                count++;
            }
        }
        if(count<2){
            System.out.print(res);
        }
        else{
            System.out.print(res);
            System.out.print(count);
        }
        return a;
    }
}
