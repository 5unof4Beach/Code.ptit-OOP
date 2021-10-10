package codeptit;

import java.util.*;

public class BienDoiAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder st = new StringBuilder(s);
        int countChar = 1;
        int groupCount = 1;
        for(int i=0;i<st.length()-1;i++){
            if(st.charAt(i) == st.charAt(i+1)){
                countChar++;
            }
            else{
                if(countChar == 1){
                    st.replace(i, i+1, replace(st.charAt(i)));
                }
                countChar = 1;
                groupCount++;
            }
        }
//        System.out.println(st);
        s = st.toString();
        solution(s, groupCount);
    }
    public static String replace(char c){
        if(c == 'A') return "B";
        return "A";
    }
    public static void solution(String s,int groupCount){
        int res = 0;
        char startChar = s.charAt(0);
        if(startChar == 'A'){
            if(groupCount % 2 == 0) res = groupCount;
            else res = groupCount - 2;
        }
        else{
            if(groupCount % 2 == 0) res = groupCount-2;
            else res = groupCount;
        }
        System.out.println(res);
    }
}
