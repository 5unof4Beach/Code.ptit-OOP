package danhsachmathang;


public class Product {
    private String name,group;
    private double importPrice,sellPrice,profit;
    private int id;

    public Product( int id,String name, String group, double importPrice, double sellPrice) {
        this.name = name;
        this.group = group;
        this.importPrice = importPrice;
        this.sellPrice = sellPrice;
        this.id = id;
        setProfit();
    }
    private void setProfit(){
        profit = sellPrice - importPrice;
    }
    
    public double getProfit(){
        return profit;
    }
    
    public void show(){
        System.out.printf("%d %s %s %.2f\n",id,name,group,profit);
    }
}
