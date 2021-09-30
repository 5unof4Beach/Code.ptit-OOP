package codeptit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author suckm
 */
public class ChuanHoaCau {
    public static void main(String[] args) throws FileNotFoundException {
//        File f = new File("C:\\Users\\suckm\\OneDrive\\Desktop\\Test.txt");
        Scanner sc = new Scanner(System.in);
        Vector<String> res = new Vector<String>();
        String temp = "";
        while(sc.hasNextLine()){
            temp = sc.nextLine();
            temp = temp.replaceAll("\\s+", " ");
            temp = temp.substring(0,1).toUpperCase()+temp.substring(1).toLowerCase();
            res.add(temp);
        }
        
        for(String i:res){
            char last = i.charAt(i.length()-1);
            if( last != '.' && last!='!' && last != '?'){
                i += '.';
            }
            if(i.charAt(i.length()-2) == ' '){
                i = i.substring(0,i.length()-2) + i.substring(i.length()-1);
            }
            System.out.println(i);
        }
    }
}
