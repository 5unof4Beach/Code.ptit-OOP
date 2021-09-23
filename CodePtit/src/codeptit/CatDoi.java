package codeptit;
import java.util.*;

public class CatDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String s = sc.nextLine();
            System.out.println(solution(s));
        }
    }
    public static String solution(String s){
        String res = "";
        for(int i=0;i<s.length();i++){
            if(getNum(s.charAt(i)) == '@') return "INVALID";
            res += getNum(s.charAt(i));
        }
        int i=0;
        while(i < res.length()){
            if(res.charAt(i)=='0')
                i+=1;
            else break;
        }
        if(i == res.length()) return "INVALID";
        res = res.substring(i);
        return res;
    }
    
    public static char getNum(char c){
        if(c == '1') return '1';
        else if(c == '0' || c == '8' || c == '9') return '0';
        else return '@';
    }
}
