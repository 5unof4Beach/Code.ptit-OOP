
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        String a[] = fullName.split(" ",2);
        String id = a[0];
        String name = a[1];
        System.out.println(a[0]);
        System.out.println(name);
        
    }

}