package nhap_xuat_hang_J05076;

/**
 *
 * @author suckm
 */
public class Stat {
    private String id,type,name;
    private long importAmount,exportAmount,pricetag,imPrice,exPrice;
    private double tax;

    public Stat(String id, long importAmount, long exportAmount, long pricetag) {
        this.id = id;
        this.importAmount = importAmount;
        this.exportAmount = exportAmount;
        this.pricetag = pricetag;
    }

    public String getId() {
        return id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private void setTax(){
        if(type.equals("A"))
            tax = 0.08;
        else if(type.equals("B"))
            tax = 0.05;
        else if(type.equals("C"))
            tax = 0.02;
    }
    
    public void setImPriceAndExPrice(){
        imPrice = importAmount * pricetag;
        exPrice = (long) (exportAmount * pricetag *(1+tax) );
    }
    
    public void show(){
        setTax();
        setImPriceAndExPrice();
        System.out.printf("%s %s %d %d\n",id,name,imPrice,exPrice);
    }
}
