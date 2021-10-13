package codeptit;

import java.util.*;

public class BienDoiAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int countChar = 1;
        int groupCount = 1;
        char firstChar = st.charAt(0);
        for(int i=0;i<st.length()-1;i++){
            if(st.charAt(0) != st.charAt(1)){
                firstChar = getChar(st.charAt(0));
                groupCount--;
            }
            else if(st.charAt(i) == st.charAt(i+1)){
                countChar++;
            }
            else{
                if(countChar == 1){
                    groupCount -= 2;
                }
                countChar = 1;
                groupCount++;
            }
        }
        solution(st, groupCount, firstChar);
    }
    
    public static char getChar(char c){
        if(c == 'A') return 'B';
        return 'A';
    }
    
    public static void solution(String s,int groupCount,char startChar){
        int res = 0;
        if(startChar == 'A'){
            if(groupCount == 1){
                res = 0;
            }
            else{
                res = groupCount - 1;
            }
        }
        else{
            if(groupCount == 1){
                res = 1;
            }
            else{
                res = groupCount;
            }
        }
        System.out.println(res);
    }
}
