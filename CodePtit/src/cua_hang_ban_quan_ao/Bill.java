package cua_hang_ban_quan_ao;

/**
 *
 * @author suckm
 */
public class Bill {
    private String id,numID,productId;
    private long amount,discount,totalPay,productPrice;
    private double percentDiscount;
    private Product product = new Product("id","name", 1, 1);

    public Bill(String id, int numID,long amount) {
        this.id = id;
        this.numID = String.format("%03d", numID);
        this.amount = amount;
        setProductId();
        setPercentDiscount();
    }

    public String getProductId() {
        return productId;
    }
    
    public void setProductId() {
        this.productId = id.substring(0,2);
    }

    public void setProductPrice() {
        this.productPrice = product.getPrice().get(id.charAt(2)-'0'-1);
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setDiscount() {
        this.discount =  (long)(productPrice * amount * percentDiscount);
    }

    public void setTotalPay() {
        this.totalPay = productPrice * amount - discount;
    }

    public void setPercentDiscount() {
        if(amount >= 150) percentDiscount = 0.5;
        else if(amount >= 100) percentDiscount = 0.3;
        else if(amount >= 50)percentDiscount = 0.15;
        else percentDiscount = 0;
    }

    public long getTotalPay() {
        return totalPay;
    }
    
    public void show(){
        System.out.printf("%s %s %d %d\n",id + '-' + numID,
                            product.getName(),
                            discount,
                            totalPay
                            );
    }
}
