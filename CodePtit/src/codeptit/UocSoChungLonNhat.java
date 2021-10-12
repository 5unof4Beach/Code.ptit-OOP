package codeptit;

import java.util.Scanner;

public class UocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            int a[] = new int[1002];
            int b[] = new int[1003];
            for(int i=1;i<=n;i++){
                a[i] = sc.nextInt();
            }
            sc.nextLine();
            a[n+1] = a[0] = 1;
            for(int i=1;i<=n+1;i++){
                int res = (a[i-1] * a[i]) / gcd(a[i-1],a[i]);
                System.out.print(res + " ");
            }
            System.out.println("");
        }
    }
    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}
