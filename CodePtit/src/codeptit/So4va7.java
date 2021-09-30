package codeptit;

import java.util.*;
public class So4va7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        while(n-->0){
            String temp = sc.nextLine();
            solution(temp);
//        }
    }
    public static void solution(String s){
        int c = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='4' || s.charAt(i) == '7' ){
                c++;
            }
        }
        if(c == 4 || c == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
