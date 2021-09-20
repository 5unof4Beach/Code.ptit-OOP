package codeptit;
import java.util.*;
/**
 *
 * @author suckm
 */
public class DienThoaiCucGach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String temp = sc.nextLine();
            check(getNumber(temp));
        }

    }
    
    public static String getNumber(String str){
        String res = "";
        for(int i=0;i<str.length();i++){
            char c = Character.toUpperCase(str.charAt(i));
            if(c == 'A' || c == 'B' || c == 'C') res += '2';
            else if(c == 'D' || c == 'E' || c == 'F') res += '3';
            else if(c == 'G' || c == 'H' || c == 'I') res += '4';
            else if(c == 'J' || c == 'K' || c == 'L') res += '5';
            else if(c == 'M' || c == 'N' || c == 'O') res += '6';
            else if(c == 'P' || c == 'Q' || c == 'R' || c == 'S') res += '7';
            else if(c == 'T' || c == 'U' || c == 'V') res += '8';
            else if(c == 'W' || c == 'X' || c == 'Y' || c == 'Z') res += '9';
        }
        return res;
    }
    
    public static void check(String s){
         int flag = 1;
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
