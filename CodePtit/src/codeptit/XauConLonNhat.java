package codeptit;

import java.util.*;

/**
 *
 * @author suckm
 */
public class XauConLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        solution(s);
    }
    
    public static void solution(String s){
//        List<String> res = new ArrayList<String>();
        List<Character>  iterated = new ArrayList<Character>();        
        HashMap<Character,Integer> chars = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!chars.containsKey(s.charAt(i)))
                chars.put(s.charAt(i),1);
            else{
                chars.put(s.charAt(i), chars.get(i)+1);
            }
        }
    }
}
