package quanlytiennuoc;

public class WaterCustomer {
    private String ID,name;
    private long oldIndex,currentIndex,priceTag,total;
    private double percentFee;
    public WaterCustomer(int id,String name,long OI,long CI){
        if(id<10) ID = "KH0" + id;
        else ID = "KH" + id;
        this.name = name;
        this.oldIndex = OI;
        this.currentIndex = CI;
        setPercentFeeAndTotal();
    }
    
    public void setPercentFeeAndTotal(){
        long amount = currentIndex - oldIndex;
        if(amount > 100){ 
            total = 50*100 + 50*150 + (amount - 100)*200;
            percentFee = 1.05;
        }
        else if(amount > 50){ 
            total = 50*100 + (amount - 50)*150;
            percentFee = 1.03;
        }
        else {
            total = amount*100;
            percentFee = 1.02;
        }
        total = Math.round(total * percentFee);
    }

    public long getTotal() {
        return total;
    }
    
    public void show(){
        System.out.printf("%s %s %d\n",ID,name,total);
    }
        
}
