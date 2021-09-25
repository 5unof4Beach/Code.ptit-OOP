package codeptit;
import java.util.*;
public class DayConLienTiepTongBangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n,k;
            boolean flag = true;
            Vector<Long> prefixSum= new Vector<Long>();
            n = sc.nextInt();
            k = sc.nextInt();
            sc.nextLine();
            long sum = 0;
            for(int j=0;j<n;j++){
                sum += sc.nextLong();
                if(!flag) continue;
                if(prefixSum.contains(sum-k)){
                    System.out.println("YES");
                    flag = false;
//                    break;
                }
                prefixSum.add(sum);
            }
            if(flag){
                System.out.println("NO");
            }
        }
    }
}
