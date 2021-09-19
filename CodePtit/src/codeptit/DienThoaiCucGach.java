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
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            res += sol(str.charAt(i));
        }
        return res;
    }
    
    public static String sol(char c){
        if(c == 'a' || c == 'b'||c=='c') return "2";
        else if(c=='d' || c=='e'||c=='f') return "3";
        else if(c=='g' || c=='h'||c=='i') return "4";
        else if(c=='k' || c=='j'||c=='l') return "5";
        else if(c=='m' || c=='n'||c=='o') return "6";
        else if(c=='p'||c=='q' || c=='r'||c=='s') return "7";
        else if(c=='t' || c=='u'||c=='v') return "8";
        else return "9";
        
    }
    public static void check(String num){
        boolean flag = true;
        int n = num.length();
        for(int i=0;i<n/2;i++){
            if(num.charAt(i) != num.charAt(n-i-1))
                flag = false;
                break;
        }
        if(flag){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
