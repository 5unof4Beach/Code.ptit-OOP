package codeptit;

import java.util.*;
public class SoDep1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String str = sc.nextLine();
            if( isNiceNum3(str) ){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
    public static boolean isNiceNum1(String n){
        for(int i=0; i<(int)(n.length()/2);i++){
            if( n.charAt(i) != n.charAt(n.length() - i -1)){
                return false;
            }
            else if( (n.charAt(i) - '0') % 2 !=0){
                return false;
            }
        }
        return true;
        
    }
    
    public static boolean isNiceNum2(String n){
        int flag = 1;
        if (n.charAt(0) != '8') return false;
        
        for(int i=0; i<(int)(n.length()/2);i++){
            if( n.charAt(i) != n.charAt(n.length() - i -1)){
                return false;
            }
        }
        long sum = 0;
        for(int i=0; i< n.length();i++){
            sum += n.charAt(i) - '0';
        }
        if(sum % 10 != 0) return false;
        return true;
    }
    
    public static boolean isNiceNum3(String n){
        for(int i=0; i<(int)(n.length()/2);i++){
            if( n.charAt(i) != n.charAt(n.length() - i -1)){
                return false;
            }
        }
        
        for(int i=0; i< (n.length()/2) + 1;i++){
            if ( !isPrime(n.charAt(i) - '0') ){
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean isPrime(int n){
        if(n==2 || n==3 || n==5 || n==7 )
        return true;
        return false;
    }
}
