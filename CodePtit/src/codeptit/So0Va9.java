package codeptit;

import java.util.*;

/**
 *
 * @author suckm
 */
public class So0Va9 {
    static List<String> vec = new LinkedList<String>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        generateAllNumbers();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(solution(n));
        }
    }
  
    public static void generateAllNumbers() {
        Queue<String> q = new LinkedList<String>();
        q.add("9");
  
        for (int count = 10000; count > 0; count--){
            String s1 = q.peek();
            q.remove();
            vec.add(s1);
  
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "9");
        }
    }
  
    public static String solution(int n) {
        for (int i = 0; i < vec.size(); i++){
            if (Integer.parseInt(vec.get(i)) % n == 0) {
                return vec.get(i);
            }
        }
        return "";
    }
}
