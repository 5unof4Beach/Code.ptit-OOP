package codeptit;
import java.util.*;
public class SoLaMa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String s = sc.nextLine();
            convert(s);
        }
    }
    public static int getNum(char c){
        if(c == 'I') return 1;
        else if(c == 'V') return 5;
        else if(c == 'X') return 10;
        else if(c == 'L') return 50;
        else if(c == 'C') return 100;
        else if(c == 'D') return 500;
        else return 1000;
    }
    public static void convert(String s){
        int res = 0;
        for(int i=0;i<s.length();i++){
            int temp1 = getNum(s.charAt(i));
            if(i + 1<s.length()){
                int temp2 = getNum(s.charAt(i+1));
                if(temp1 >= temp2){
                    res += temp1;
                }
                else{
                    res += temp2 - temp1;
                    i++;
                }
            }
            else{
                res += temp1;
            }
        }
        System.out.println(res);
    }
}
