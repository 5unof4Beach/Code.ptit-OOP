package codeptit;
import java.util.*;
/**
 *
 * @author suckm
 */
public class HopHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> res = new Vector<Integer>();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        n2 += n1;
        for(int i=0;i<n2;i++){
            int temp = sc.nextInt();
            if(res.contains(temp)) continue;
            else res.add(temp);
        }
        Collections.sort(res);
        for(Integer i:res){
            System.out.print( i.intValue() + " ");
        }
        System.out.println("");
    }
}
