package codeptit;
import java.util.*;
public class GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Vector<Integer> A = new Vector<Integer>();
        Vector<Integer> B = new Vector<Integer>();
        Vector<Integer> res = new Vector<Integer>();
        for(int i=0;i<n1;i++){
            int n = sc.nextInt();
            if(A.contains(n)){
               continue;
            }
            else{
                A.add(n);
            }
        }
        for(int i=0;i<n2;i++){
            int n = sc.nextInt();
            if(B.contains(n)){
               continue;
            }
            else{
                B.add(n);
            }
        }
        Collections.sort(A);
        for(Integer i:A){
            if(B.contains(i.intValue()))
                System.out.print(i.intValue()+" ");
        }
        System.out.println("");
    }
    
}
