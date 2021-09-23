package codeptit;
import java.util.*;

public class DayDuCacChuSo {
    public static Vector<Integer> sample = new Vector<Integer>();
    public static Vector<Integer> digit = new Vector<Integer>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        generateSample();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            long n = sc.nextLong();
            sc.nextLine();
            int i=2;
            if(n==0){
                System.out.println("Impossible");
                continue;
            }
            if(isFull(n)){
                System.out.println(n);
                continue;
            }
            while(!isFull(n*i)){
                i++;
            }
            System.out.println(n*i);
            digit.clear();
        }
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
