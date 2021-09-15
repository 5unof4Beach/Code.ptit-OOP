package khohang;

/**
 *
 * @author suckm
 */
public class Product {
    private String ID,name;
    private int index, amount,price;
    public Product(int index,String codeName,String name,int amount,int price){
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.ID = codeName + "0" + index;
    }
    private float getPercent(){
        if(amount>10) return (float)5/100;
        else if(amount>=8) return (float)2/100;
        else if(amount>=5) return (float)1/100;
        return 0;
    }
    
    void show(){
        int totalPrice = price * amount;
        int percentExtract = (int)(totalPrice * getPercent());
        System.out.printf("%s %s %d %d\n",ID,name,percentExtract,totalPrice-percentExtract);;
    }
    
}
