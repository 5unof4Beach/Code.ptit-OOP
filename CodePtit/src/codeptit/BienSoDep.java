package codeptit;

import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class BienSoDep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String plate = sc.nextLine();
            plate = plate.replace(".", "");
            plate = plate.substring(5);
            if(increasing(plate)){
                System.out.println("YES");
            }
            else if(sameNumber(plate)){
                System.out.println("YES");
            }
            else if(same3same2(plate)){
                System.out.println("YES");
            }
            else if(all68(plate)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
        }
    }
}
    
    public static boolean increasing(String s){
        for(int i=0;i<4;i++){
            if(s.charAt(i) >= s.charAt(i+1)) return false;
        }
        return true;
    }
    
    public static boolean sameNumber(String s){
        for(int i=0;i<4;i++){
            if(s.charAt(i) != s.charAt(i+1)) return false;
        }
        return true;
    }
    
    public static boolean same3same2(String s){
        for(int i=0;i<2;i++){
            if(s.charAt(i) != s.charAt(i+1)) return false;
        }
        for(int i=3;i<4;i++){
            if(s.charAt(i) != s.charAt(i+1)) return false;
        }
        return true;
    }
    
    public static boolean all68(String s){
        for(int i=0;i<5;i++){
            if(s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        }
        
        return true;
    }
}
