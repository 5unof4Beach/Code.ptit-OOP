package codeptit;
import java.util.*;
public class KhoangCachNhoHonK {
    public static int n,k;
    public static List<Integer> arr= new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            n = sc.nextInt();
            k = sc.nextInt();
            for(int i=0;i<n;i++){
                arr.add(sc.nextInt());
            }
            sc.nextLine();
            solution();
            arr.clear();
        }
    }
    public static void solution(){
        Collections.sort(arr);
        int maxPos = 0;
        long res = 0;
        boolean flag = true;
        for(int i=0;i<n;i++){
            flag = true;
            for(int j = Math.max(maxPos, i+1);j<n;j++){
                if(arr.get(j) - arr.get(i)>=k){
                    maxPos = j;
                    flag = false;
                    res += j-i-1;
                    break;
                }
            }
            //nếu ko có số nào lớn nhất tạo ra hiệu < k với phàn tử tại i
            //thì lấy tổ hợp chọn
            if(flag){
                long temp1 = n-i;
                long temp2 = n-i-1;
                res += (temp1 * temp2)/2;
                break;
            }
        }
        System.out.println(res);
    }
    
    
}
