package codeptit;

import java.util.*;
public class SoTamPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            String temp = sc.nextLine();
            solution(temp);
        }
    }
    public static void solution(String s){
        Vector<Character> v = new Vector<Character>();
        for(int i=0;i<s.length();i++){
            if( v.contains(s.charAt(i)) );
            else{
                v.add(s.charAt(i));
            }
        }
//        System.out.println(v);
        for(Character i:v){
            if( i.charValue() != '0' &&
                i.charValue() != '1' &&
                i.charValue() != '2'){
                System.out.println("NO");
                return ;
            }
        }
        System.out.println("YES");
    }
}
