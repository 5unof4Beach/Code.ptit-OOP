package codeptit;

import static java.lang.Math.pow;
import java.util.Scanner;

public class DienChuSo {
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int res = 0;
            int count = 0;
            for(int i = 0; i < s1.length(); i ++) {
                if(s1.charAt(i) == '?')
                    count ++;
            }
            for(int i = 0; i < s1.length(); i ++) {
                if(s1.charAt(i) == '?') {
                    count --;
                    char j = '9';
                    while(j > s2.charAt(i)) {
                        res += pow(10, count);
                        j --;
                    }
                }
                else if(s1.charAt(i) < s2.charAt(i))
                    break;
                else if(s1.charAt(i) > s2.charAt(i)) {
                    res += pow(10, count);
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
