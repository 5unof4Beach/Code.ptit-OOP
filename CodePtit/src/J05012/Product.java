package J05012;

public class Product {
    private String name,ID;
    private long amount,priceTag,discount,realPay;
    public Product(String ID,String name,long amount,long priceTag,long discount){
        this.ID = ID;
        this.name = name;
        this.priceTag = priceTag;
        this.amount= amount;
        this.discount = discount;
        setRealPay();
    }

    public long getRealPay() {
        return realPay;
    }

    private void setRealPay() {
        this.realPay = amount * priceTag - discount;
    }
    
    public void show(){
        System.out.printf("%s %s %d %d %d %d\n",ID,name,amount,priceTag,discount,realPay);
    }
    
}
