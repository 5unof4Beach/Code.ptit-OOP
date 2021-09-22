package bai2;
import java.util.*;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
            count(arr);
    }
    public static void count(int s[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int max = 0;
        for(int i=0;i<s.length;i++){
            arr.add(s[i]);
            
            while(  arr.size() >= 2 && (arr.get(arr.size()-2) + arr.get(arr.size()-1)) % 2 ==0 ){
                
                arr.remove(arr.size()-2);
                arr.remove(arr.size()-1);
            }
               
        }
        System.out.println(arr.size());
    }
}
