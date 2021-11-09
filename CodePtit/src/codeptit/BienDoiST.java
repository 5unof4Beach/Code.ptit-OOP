package codeptit;

import java.util.*;

/**
 *
 * @author suckm
 */
public class BienDoiST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            System.out.println(solution(a, b));
        }
    }
    
    public static int solution(int a, int b){
        TreeSet<Integer> s = new TreeSet<Integer>();
        s.add(a);
        LinkedList<temp> q = new LinkedList<temp>();
        q.add(new temp(a,0));
        
        while(q.size() > 0){
            temp tmp = q.getFirst();
            q.removeFirst();
            
            if(tmp.val == b) return tmp.count;
            if(tmp.val * 2 == b || tmp.val - 1 == b) return tmp.count + 1;
            
            if(!s.contains(tmp.val * 2) && tmp.val < b){
                q.add(new temp(tmp.val * 2, tmp.count + 1));
                s.add(tmp.val * 2);
            }
            
            if(!s.contains(tmp.val - 1) && tmp.val - 1>0 ){
                q.add(new temp(tmp.val - 1, tmp.count + 1));
                s.add(tmp.val - 1);
            }
        }
        return 0;
    }
}


class temp{
    int val, count;

    public temp(int val, int count) {
        this.val = val;
        this.count = count;
    }
    
}