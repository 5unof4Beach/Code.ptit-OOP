package danhsachmathang;
import java.util.*;
/**
 *
 * @author suckm
 */
public class SXDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Product> res = new ArrayList<Product>();
        for(int i=1;i<=t;i++){
            String name = sc.nextLine();
            String group = sc.nextLine();
            Double im = sc.nextDouble();
            Double sell = sc.nextDouble();
            sc.nextLine();
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
    private int id;

    public Product( int id,String name, String group, double importPrice, double sellPrice) {
        this.name = name;
        this.group = group;
        this.importPrice = importPrice;
        this.sellPrice = sellPrice;
        this.id = id;
        setProfit();
    }
    private void setProfit(){
        profit = sellPrice - importPrice;
    }
    
    public double getProfit(){
        return profit;
    }
    
    public void show(){
        System.out.printf("%d %s %s %.2f\n",id,name,group,profit);
    }
}
