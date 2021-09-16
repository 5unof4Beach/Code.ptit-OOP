package nhapxuathang;

/**
 *
 * @author suckm
 */
public class Product {
    private String code,group;
    private long importAmount,exportAmount,money,priceTag,tax;
    
    public Product(String code,long importAmount){
        this.code = code;
        this.importAmount = importAmount;
        setExportAmountAndTaxAndPriceTag();
        setMoney();
    }

    public String getGroup() {
        return group;
    }

    private void setExportAmountAndTaxAndPriceTag() {
        String firstChar = code.substring(0,1);
        String lastChar  =  code.substring(4);
        //set so luong xuat hang
        if(firstChar.equals("A")){
            exportAmount = (long) (Math.round( importAmount*(60/100.0) ));
        }
        else{
            exportAmount = (long) (Math.round( importAmount*(70/100.0) ));
        }
        
        //set don gia
        if(lastChar.equals("Y")) priceTag = 110000;
        else priceTag = 135000;
        
        //set thue
        if(firstChar.equals("A") && lastChar.equals("Y")) tax = 8;
        else if(firstChar.equals("A") && lastChar.equals("N")) tax = 11;
        else if(firstChar.equals("B") && lastChar.equals("Y")) tax = 17;
        else tax = 22;
        
        this.group = firstChar;
    }
    public long getTaxMoney(){
        return money*tax/100;
    }

    private void setMoney() {
        money = exportAmount * priceTag;
    }

    public void show(){
        System.out.printf("%s %d %d %d %d %d\n",
        code,importAmount,exportAmount,priceTag,money,money*tax/100);
    }
}
