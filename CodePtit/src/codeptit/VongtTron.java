package codeptit;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class VongtTron {
    public static Vector<Character> checked = new Vector<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        System.out.println(countCharOnlyAppearOnce(s));
        int res = 0;
        for(char i ='A';i<='Z';i++){
            if(!checked.contains(i)){
                int pos_start = s.indexOf(i);
                int pos_end = s.substring(pos_start+1).indexOf(i) + pos_start+1;
                String temp = s.substring(pos_start+1,pos_end);
                res += countCharOnlyAppearOnce(temp);
                checked.add(i);
            }
        }
        System.out.println(res);
    }
    
    public static int countCharOnlyAppearOnce(String s){
        Vector<Character> chars = new Vector<>();
        int res = 0;
        for(int i=0;i<s.length();i++){
            if(chars.contains(s.charAt(i))){
                res--;
            }
            else{
                if(checked.contains(s.charAt(i)));
                else{
                    chars.add(s.charAt(i));
                    res++;
                }
            }
            
        }
        return res;
    }
}
