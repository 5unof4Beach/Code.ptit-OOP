package DsmathangFileIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author suckm
 */
public class SXMatHangFileIO {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<Product> res = new ArrayList<Product>();
        for(int i=1;i<=t;i++){
            String name = sc.nextLine();
            String group = sc.nextLine();
            Double im = Double.parseDouble(sc.nextLine());
            Double sell = Double.parseDouble(sc.nextLine());
            Product pr = new Product(i, name, group, im, sell);
            res.add(pr);
        }
        res.sort((i1,i2)->Double.compare(i2.getProfit(), i1.getProfit()));
        for(Product i:res){
            i.show();
        }
    }
}


class Product {
    private String name,group;
    private double importPrice,sellPrice,profit;
    private String id;

    public Product( int id,String name, String group, double importPrice, double sellPrice) {
        this.name = name;
        this.group = group;
        this.importPrice = importPrice;
        this.sellPrice = sellPrice;
        this.id = String.format("MH%02d",id);
        setProfit();
    }
    private void setProfit(){
        profit = sellPrice - importPrice;
    }
    
    public double getProfit(){
        return profit;
    }
    
    public void show(){
        System.out.printf("%s %s %s %.2f\n",id,name,group,profit);
    }
}
