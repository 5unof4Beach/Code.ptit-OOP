package codeptit;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Character> res = new Vector<>();
        String s = sc.nextLine();
        for(int i = 0;i<s.length();i++){
            if(res.contains(s.charAt(i)));
            else
                res.add(s.charAt(i));
        }
        System.out.println(res.size());
    }
}
