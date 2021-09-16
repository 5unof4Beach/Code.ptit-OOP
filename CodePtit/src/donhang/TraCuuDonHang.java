package donhang;
import java.util.*;

public class TraCuuDonHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<Product> res = new Vector<Product>();
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            String code = sc.nextLine();
            long priceTag = sc.nextLong();
            long amount = sc.nextLong();
            sc.nextLine();
            Product pr = new Product(name,code,priceTag,amount);
            res.add(pr);
        }
        res.sort((i1,i2)->i1.getPlace().compareTo(i2.getPlace()));
        for(Product i:res){
            i.show();
        }
    }
}


class Product {
    private String name,code,place;
    private long priceTag,amount,discount,total;
    
    public Product(String name,String code,long priceTag,long amount){
        this.name = name;
        this.code = code;
        this.priceTag = priceTag;
        this.amount = amount;
        setDiscountAndPlaceAndTotal();
    }

    public String getPlace() {
        return place;
    }
    
    private void setDiscountAndPlaceAndTotal(){
        String digit = code.substring(4);
        place = code.substring(1,4);
        if(digit.equals("1")) discount = 50 * priceTag * amount / 100;
        else discount = 30 * priceTag * amount / 100;
        total = priceTag * amount - discount;
    }
    public void show(){
        System.out.printf("%s %s %s %d %d\n",name,code,place,discount,total);
    }
    
}

