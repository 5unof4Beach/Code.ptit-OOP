package codeptit;

import java.util.*;

/**
 *
 * @author suckm
 */
public class XauConLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char[] kiTu = new char [n.length()];
        n.getChars(0, n.length(), kiTu, 0);
        Arrays.sort(kiTu);
        int j = 0;
        int[] In = new int [n.length()];
        int dem = 0;
        while(j < n.length()) {
            if(n.charAt(j) == kiTu[kiTu.length - 1])
                In[dem ++] = j;
            j ++;
        }
        j = In[dem - 1] + 1;
        for(int i = kiTu.length - 2; i >= 0; i --) {
            boolean OK = false;
            int k = j;
            if(kiTu[i] != kiTu[i + 1])
                while(j < n.length()) {
                    if(n.charAt(j) == kiTu[i]) {
                        In[dem ++] = j;
                        OK = true;
                    }
                    j ++;
                }
            if(OK)
                j = In[dem - 1] + 1;
            else
                j = k;
            if(j > n.length() - 1)
                break;
        }
        for(int i = 0; i < dem; i ++)
            System.out.print(n.charAt(In[i]));
    }
}
