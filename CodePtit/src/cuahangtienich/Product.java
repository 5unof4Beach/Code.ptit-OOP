package cuahangtienich;

public class Product {
    private String name,unit,ID;
    private long pricetag,amount,shipFee,money,total,retailPrice;
    
    public Product(int id,String name,String unit,Long priceTag,long amount){
        if(id<10) ID = "MH0" + id;
        else ID = "MH" + id;
        this.name = name;
        this.unit = unit;
        this.pricetag = priceTag;
        this.amount= amount;
        setShipFee();
        setMoney();
        setTotal();
        setRetailPrice();
    }
    
    public void setShipFee(){
        shipFee = Math.round((5*pricetag*amount)/100.0);
    }
    public void setMoney(){
        money = pricetag * amount + shipFee;
    }
    public void setTotal(){
        total = Math.round(money + 2*money/100.0);
    }
    public void setRetailPrice(){
        Double temp = (money + 2*money/100.0)/(double)amount;
        retailPrice = (long) (Math.ceil(temp/100.0)*100);
    }

    public long getRetailPrice() {
        return retailPrice;
    }
    
    public void show(){
        System.out.printf("%s %s %s %d %d %d\n",ID,name,unit,shipFee,money,total);
    }
    
    public void show2(){
        System.out.printf("%s %s %s %d %d %d\n",ID,name,unit,shipFee,money,retailPrice);
    }
}
