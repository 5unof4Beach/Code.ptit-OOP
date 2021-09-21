package codeptit;
import java.util.*;
public class DayConCoKPhanTuTangDan {
    public static int n,k;
    public static int X[] = new int[100];
    public static int unused[] = new int[100];
    public static List<Integer> arr= new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            n = sc.nextInt();
            k = sc.nextInt();
            X[0] = 0;
            for(int i=0;i<n;i++){
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            sc.nextLine();
            BackTrack(1);
            arr.clear();
//            System.out.println("");
        }
    }
    
    public static void BackTrack(int i){	
	for(int j=X[i-1]+1; j<=n-k+i; j++){
            X[i]=j;	
            if(i==k)	
                print();
            else		
                BackTrack(i+1);
	}
	return;
    }
    public static void print(){
	for(int j=1; j<=k; j++) {
            System.out.print(arr.get(X[j]-1)+ " ");
        }
        System.out.println();
    }
    
}
