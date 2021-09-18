package codeptit;
import java.util.*;

public class LoaiBo100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String num = sc.nextLine();
            String temp = "";
            int originalLength = num.length();
            while(true){
                temp = num;
                num = num.replace("100", "");
                if(temp.equals(num)) break;
            }
            System.out.printf("%d\n",originalLength - num.length());
        }
    }
}
