package codeptit;
import java.util.*;
public class DaoDau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        solution(n, k, sc);
        
    }
    
    public static void solution(int n,int k,Scanner sc){
        long res = 0;
        Vector<Integer> arr = new Vector<Integer>();
        
        for(int i = 0;i<n;i++){
            int temp = sc.nextInt();
            arr.add(temp);
        }
        //đổi dấu những số âm
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            if(k>0 && arr.get(i)<0){
                arr.set(i, -arr.get(i));
                k--;
            }
        }
        
        Collections.sort(arr);
        //nếu phép biến đổi còn lại lẻ thì đổi dấu phần tử bé nhất
        if(k%2 == 1){
            arr.set(0, -arr.get(0));
        }
        for(Integer i:arr){
            res += i.intValue();
        }
        System.out.println(res);
    }
}
