package codeptit;
import java.util.*;
//https://www.geeksforgeeks.org/length-longest-sub-string-can-make-removed/
public class LoaiBo100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String num = sc.nextLine();
            count(num);
        }
    }
    public static void count(String s){
        ArrayList<character> arr = new ArrayList<character>();
        arr.add(new character('@',-1));
        int max = 0;
        for(int i=0;i<s.length();i++){
            arr.add(new character(s.charAt(i),i));
            
            while(  arr.size() >= 3 && 
                    arr.get(arr.size()-3).c == '1' &&
                    arr.get(arr.size()-2).c == '0' &&
                    arr.get(arr.size()-1).c == '0'){
                
                arr.remove(arr.size()-3);
                arr.remove(arr.size()-2);
                arr.remove(arr.size()-1);
            }
            // case 100101000
            int temp = arr.get(arr.size()-1).index;
            max = Math.max(max, i - temp);
               
        }
        System.out.println(max);
    }
}

class character{
    char c;
    int index;
    public character(char c,int i){
        this.c = c;
        this.index = i;
    }
}