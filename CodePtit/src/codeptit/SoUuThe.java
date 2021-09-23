package codeptit;
import java.util.*;

public class SoUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            check(s);
        }
    }
    public static void check(String s){
        int even = 0;
        int odd = 0;
        if(s.charAt(0) == '0'){
            System.out.println("INVALID");
            return;
        }
        for(int i=0;i<s.length();i++){
            int temp = s.charAt(i) - '0';
            if(temp>9 || temp <0){
                System.out.println("INVALID");
                return;
            }
            else if(temp % 2 == 0) even++;
            else odd++;
        }
        if(even > odd && s.length()%2==0 || even<odd && s.length()%2==1){
            System.out.println("YES");
            return;
        }
        else{
            System.out.println("NO");
        }
    }
}
