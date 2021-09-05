package codeptit;
import java.util.Arrays;
import java.util.Scanner;

public class TongUocSo {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp,sum = 0;
        
//        sang so nguyen to
        int Prime_set[] = new int[200000];
        boolean num[] = new boolean[2000000];
        Arrays.fill(num,true);
        num[0] = false;
        num[1] = false;
        int pos = 0;
        for(int i=2;i*i<2000000;i++){
            if(num[i]){
                Prime_set[pos] = i;
                pos++;
                for(int j=i*i;j<2000000;j += i){
                    num[j] = false;
                }
            }
        }
       
        pos = 0;
        for(int i=0; i<n;i++){
            temp = sc.nextInt();
            if( num[temp] ){
                sum += temp;
            }
            else{
                pos = 0;
                while( temp != 1 ){
                    while(temp % Prime_set[pos] == 0){
                        sum += Prime_set[pos];
                        temp /= Prime_set[pos];
                    }
                    if(num[temp]){
                        sum += temp;
                        break;
                    }
                    pos++;
                }
            }
//            System.out.println(sum);
        }
        
        System.out.println(sum); 
    }
}
