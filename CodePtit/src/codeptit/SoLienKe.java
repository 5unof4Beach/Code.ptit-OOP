package codeptit;

import java.util.*;
public class SoLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String temp = sc.nextLine();
            solution(temp);
        }
    }
    public static void solution(String s){
        for(int i=0;i<s.length()-1;i++){
            int temp = s.charAt(i) - s.charAt(i+1);
            if(Math.abs(temp) != 1 ){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
