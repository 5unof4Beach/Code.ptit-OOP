package QuanLyxangDau;

public class Product {
    private String id,name,manufacturer;
    private long price,amount,total,tax;
    private double taxPercent;

    public Product(String id, long amount) {
        this.id = id;
        this.amount = amount;
        setManufacturerAndTaxPercent();
        setTax();
        setTotal();
    }

    public void setManufacturerAndTaxPercent() {
        String manufacturerID = id.substring(id.length()-2);
        if(id.charAt(0) == 'X'){ taxPercent = 0.03; price = 128000;}
        else if(id.charAt(0) == 'D'){ taxPercent = 0.035; price = 11200;}
        else{ taxPercent = 0.02; price = 9700;}
        if(manufacturerID.equals("TN")) taxPercent = 0;
        
        if(manufacturerID.equals("BP")) manufacturer = "British Petro";
        else if(manufacturerID.equals("ES")) manufacturer = "Esso";
        else if(manufacturerID.equals("SH")) manufacturer = "Shell";
        else if(manufacturerID.equals("CA")) manufacturer = "Castrol";
        else if(manufacturerID.equals("MO")) manufacturer = "Mobil";
        else manufacturer = "Trong Nuoc";
    }

    public void setTax() {
        tax = (long) (amount * price * taxPercent);
    }
    
    public void setTotal(){
        total = amount * price + tax;
    }

    public long getTotal() {
        return total;
    }
    
    public void show(){
        System.out.printf("%s %s %d %d %d\n",id,manufacturer,price,tax,total);
    }
    
}
