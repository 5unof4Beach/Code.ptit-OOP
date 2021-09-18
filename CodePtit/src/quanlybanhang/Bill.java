package quanlybanhang;

/**
 *
 * @author suckm
 */
public class Bill {
    private String ID,customerID,productID;
    private long amount,profit;
    private Customer customer ;
    private Product product ;

    public Bill(int id, String customerID, String productID, long amount) {
        if(id<10) ID = "HD00" + id;
        else ID = "HD0" + id;
        this.ID = ID;
        this.customerID = customerID;
        this.productID = productID;
        this.amount = amount;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getProductID() {
        return productID;
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setProfit() {
        this.profit = amount*(product.getSellPrice()-product.getImportPrice());
    }

    public long getProfit() {
        return profit;
    }
    
    public void show1(){
        System.out.printf("%s %s %s %s %s %d %d %d %d\n",
                ID,customer.getName(),customer.getAddress(),
                product.getName(),product.getUnit(),
                product.getImportPrice(),product.getSellPrice(),
                amount,amount*product.getSellPrice());
    }
    
    public void show2(){
        System.out.printf("%s %s %s %s %d %d %d\n",
                ID,customer.getName(),customer.getAddress(),
                product.getName(),
                amount,amount*product.getSellPrice(),
                profit );
    }
    
}
