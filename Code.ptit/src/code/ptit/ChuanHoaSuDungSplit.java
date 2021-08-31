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
public class ChuanHoaSuDungSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            chuanHoa(s);
        }
    }
    public static void chuanHoa(String s){
        s = s.trim();
        String arr[] = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i=1;i<arr.length;i++){
            res.append(Character.toUpperCase(arr[i].charAt(0)));
            for(int j=1;j<arr[i].length();j++){
                res.append(Character.toLowerCase(arr[i].charAt(j)));
            }
            res.append(" ");
        }
        res.deleteCharAt(res.length()-1);
        System.out.print(res + ", ");
        System.out.println(arr[0].toUpperCase());
    }
}
