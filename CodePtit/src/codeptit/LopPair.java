package codeptit;

import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class LopPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair p = new Pair(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}

class Pair{
    private int a,b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public  boolean check(int n){
        if(n < 2) return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    
    public boolean isPrime(){
        if(check(a) && check(b)) return true;
        return false;
    }
    
    @Override
    public String toString(){
        return a+" "+b;
    }
}