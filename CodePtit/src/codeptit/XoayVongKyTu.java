package codeptit;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class XoayVongKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<String> strs = new Vector<>();
        solution(strs, sc, n);
        
    }
    
    public static void solution(Vector<String> strs, Scanner sc, int n){
        Vector<Integer> steps = new Vector<>();
        steps.add(0);
        boolean legit = true;
        for(int i=0;i<n;i++){
            strs.add(sc.nextLine());
        }
        String first = strs.get(0);
        int len = first.length();
        for(int i=1; i<n;i++){
            String temp = strs.get(i);
            int idx = temp.indexOf(first.charAt(0));
            int tempLen = temp.length();
            if(idx < 0 || tempLen != len){
                legit = false;
                break;
            }
            while(idx<len){
                if(temp.substring(idx).equals(first.substring(0,len - idx))){
                    if(idx == 0) break;
                    if(temp.substring(0,idx).equals(first.substring(len-idx))) break;
                }
                idx++;
            }
            if(idx == len){
                legit = false;
                break;
            }
            else{
                steps.add(idx);
            }
        }
        
        if(legit){
            int res = 10000;
            for(int i = 0;i<n;i++){
                int temp = len - steps.get(i);
                int sum = 0;
                for(int j = 0;j<n;j++){
                    int distance = steps.get(j) + temp;
                    if(distance >= len){
                        sum -= len;
                    }
                    sum += distance;
                }
                if(sum < res){
                    res = sum;
                }
            }
            System.out.println(res);
        }
        else{
            System.out.println(-1);
        }
    }
}