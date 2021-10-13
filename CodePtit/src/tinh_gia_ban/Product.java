package tinh_gia_ban;

/**
 *
 * @author suckm
 */
public class Product {
    private String name;
    private long totalPrice,priceTag,amount;
    private double tax,shipping,res;

    public Product(String name, long priceTag, long amount) {
        this.name = name;
        this.priceTag = priceTag;
        this.amount = amount;
        this.totalPrice = amount * priceTag;
        setTaxAndShipping();
        calculate();
    }

    public void setTaxAndShipping() {
        char first = name.charAt(0);
        char last = name.charAt(name.length()-1);
        if(first == 'T') {
            tax = 0.29;
            shipping = 0.04;
        }
        else if(first == 'C'){
            tax = 0.1;
            shipping = 0.03;
        }
        else if(first == 'D'){
            tax = 0.08;
            shipping = 0.025;
        }
        else{
            tax = 0.02;
            shipping = 0.005;
        }
        
        if(last == 'C'){
            tax *= 0.95;
        }
    }
    
    public void calculate(){
        res = totalPrice* (1 + tax + shipping);
        res = res*(1 + 0.2);
        res /= (double)amount;
        res = Math.round(res*100)/100.0;
    }
    public void show(){
        System.out.printf("%s %.2f\n",name,res);
    }
}
