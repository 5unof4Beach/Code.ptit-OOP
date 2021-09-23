import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Long,Long> heSoVaBac = new HashMap<Long,Long>();
        String s = sc.nextLine();
        StringTokenizer res = new StringTokenizer(s," + ");
        while(res.hasMoreTokens()){
            String temp = res.nextToken().toString();
            System.out.println(temp);
            String bac = temp.substring(temp.indexOf('^')+1);
            String heSo = temp.substring(0,temp.indexOf('*'));
            heSoVaBac.put(convert(bac),convert(heSo));
            for (Iterator<Long> it = heSoVaBac.keySet().iterator(); it.hasNext();) {
                System.out.println(it.next().longValue());
            }
        }
    }
    
    public static long convert(String s){
        long res = 0;
        for(int i=0;i<s.length();i++){
            res = res*10 + (s.charAt(i) - '0');
        }
        return res;
    }
}
