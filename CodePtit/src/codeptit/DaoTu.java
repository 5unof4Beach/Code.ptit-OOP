package codeptit;

import java.util.*;

/**
 *
 * @author suckm
 */
public class DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            solution(s);
        }
    }
    
    public static void solution(String s){
        String word[] = s.split(" ");
        for(int i= 0;i<word.length;i++){
            convert(word[i]);
        }
        System.out.println("");
    }
    
    public static void convert(String s){
        String res = "";
        for(int i = s.length() - 1; i>=0; i--){
            res += s.charAt(i);
        }
        System.out.print(res + " ");
        
    }
}
