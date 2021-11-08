package codeptit;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            int res = 0;
            String s = sc.nextLine();
            Stack<Integer> pos = new Stack<>();
            pos.add(-1);
            
            for(int i = 0;i < s.length();i++){
                if(s.charAt(i) == '('){
                    pos.add(i);
                }
                else{
                    pos.pop();
                    if(pos.size() > 0)
                        res = Math.max(res, i - pos.lastElement());
                    if(pos.size() == 0)
                        pos.add(i);
                }
            }
        System.out.println(res);
        }
    }
}
