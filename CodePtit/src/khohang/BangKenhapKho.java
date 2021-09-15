package khohang;

import java.util.*;

/**
 *
 * @author suckm
 */
public class BangKenhapKho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<Product> res = new Vector<Product>();
        HashMap<String,Integer> productNameCode = new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            int amount = sc.nextInt();
            int price = sc.nextInt();
            sc.nextLine();
            String cd = codeNameExtract(name);
            if(productNameCode.containsKey(cd)){
                productNameCode.put(cd, productNameCode.get(cd)+1);
            }
            else{
                productNameCode.put(cd,1);
            }
            Product pr = new Product(productNameCode.get(cd), cd, name, amount, price);
            res.add(pr);
        }
        for(Product i:res){
            i.show();
        }
    }
    
    public static String codeNameExtract(String name){
        String temp[] = name.split(" ");
        String res = "";
        res = temp[0].substring(0,1) + temp[1].substring(0,1);
        return res.toUpperCase();
    }
}
