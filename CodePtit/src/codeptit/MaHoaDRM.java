package codeptit;

import java.util.*;
public class MaHoaDRM {
    public static String sample = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            DRM(s);
        }
    }
    public static void DRM(String s){
        String res = "";
        String s1 = s.substring(0,s.length()/2);
        String s2 = s.substring(s.length()/2);
        s1 = rotate(s1);
        s2 = rotate(s2);
        for(int i=0;i<s.length()/2;i++){
            char temp = sample.charAt( (sample.indexOf(s1.charAt(i)) + sample.indexOf(s2.charAt(i)))%26 );
            res += temp;
        }
        System.out.println(res);
    }
    public static String rotate(String s){
        int k = 0;
        String res = "";
        for(int i=0;i<s.length();i++){
            k += sample.indexOf(s.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            res += sample.charAt((sample.indexOf(s.charAt(i)) + k)%26);
        }
        return res;
    }
}
