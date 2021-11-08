package codeptit;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            boolean ok = true;
            String s = sc.nextLine();
            Vector<Character> chars = new Vector<>();
            for(int i = 0;i < s.length(); i++){
                char c = s.charAt(i);
                if(c == '[' || c == '(' || c == '{'){
                    chars.add(c);
                }
                else if(c == ']'){
                    if(chars.size() == 0){
                        ok = false;
                        break;
                    }
                    if(chars.lastElement() == '['){
                        chars.removeElementAt(chars.size()-1);
                    }
                }
                else if(c == '}'){
                    if(chars.size() == 0){
                        ok = false;
                        break;
                    }
                    if(chars.lastElement() == '{'){
                        chars.removeElementAt(chars.size()-1);
                    }
                }
                else if(c == ')'){
                    if(chars.size() == 0){
                        ok = false;
                        break;
                    }
                    if(chars.lastElement() == '('){
                        chars.removeElementAt(chars.size()-1);
                    }
                }
            }
            if(chars.size() > 0) ok = false;
            if(ok){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
