package codeptit;
import java.util.*;

public class DayDuCacChuSo {
    public static Vector<Integer> sample = new Vector<Integer>();
    public static Vector<Integer> digit = new Vector<Integer>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        generateSample();
        while(t-->0){
            long n = sc.nextLong();
            sc.nextLine();
            res(n);
            digit.clear();
        }
    }
    
    public static void res(Long n){
        int i=2;
        if(n==0){
            System.out.println("Impossible");
            return;
        }
        if(isFull(n)){
            System.out.println(n);
            return;
        }
        while(!isFull(n*i)){
            i++;
        }
        System.out.println(n*i);
    }
    
    public static boolean isFull(long n){
        while(n > 0){
            if(digit.contains((int)n%10));
            else digit.add((int)n%10);
            n/=10;
        }
        return digit.containsAll(sample);
    }
    
    public static void generateSample(){
        sample.add(0);
        sample.add(1);
        sample.add(2);
        sample.add(3);
        sample.add(4);
        sample.add(5);
        sample.add(6);
        sample.add(7);
        sample.add(8);
        sample.add(9);
    }
}
