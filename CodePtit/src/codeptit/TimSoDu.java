package codeptit;
import java.util.*;
/**
 *
 * @author suckm
 */
public class TimSoDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
        int num = (str.charAt(str.length()-2)-'0')*10 +
                  (str.charAt(str.length()-1)-'0');
            if(num % 4 ==0 )
                System.out.println("4");
            else
                System.out.println("0");
        }
    }
}
