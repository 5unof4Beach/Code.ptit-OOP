package codeptit;

import java.util.*;
public class SoKhongLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String temp = sc.nextLine();
            solution(temp);
        }
    }
    public static void solution(String s){
        long sum = 0;
        for(int i=0;i<s.length()-1;i++){
            int temp = s.charAt(i) - s.charAt(i+1);
            if(Math.abs(temp) != 2 ){
                System.out.println("NO");
                return;
            }
            sum += s.charAt(i) - '0';
        }
        sum += s.charAt(s.length()-1) - '0';
        if(sum % 10 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
