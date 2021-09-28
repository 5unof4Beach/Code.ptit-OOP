package xephanghocsinh;
import java.util.*;

public class BangDiemHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1;i<=n;i++){
            String name = sc.nextLine();
            double avg = sc.nextDouble();
            sc.nextLine();
            Pupil hs = new Pupil(i,name,avg);
            sol.addObject(hs);
        }
        sol.processAndPrint();
    }
}

