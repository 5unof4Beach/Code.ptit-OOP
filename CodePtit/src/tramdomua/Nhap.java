package tramdomua;

import java.text.ParseException;
import java.util.*;
public class Nhap {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            String timeStart = sc.nextLine();
            String timeEnd = sc.nextLine();
            long amount = sc.nextLong();
            sc.nextLine();
            Station st = new Station(name, timeStart, timeEnd, amount);
            sol.addObj(st);
        }
        sol.processAndPrint();
    }
}

