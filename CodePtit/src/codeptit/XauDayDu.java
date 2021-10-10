package codeptit;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class XauDayDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            Vector<Character> res = new Vector<>();
            String s = sc.nextLine();
            int k = sc.nextInt();
            sc.nextLine();
            for(int i = 0;i<s.length();i++){
                if(res.contains(s.charAt(i)));
                else
                    res.add(s.charAt(i));
            }
            int missing = 26 - res.size();
            if(k>=missing){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
