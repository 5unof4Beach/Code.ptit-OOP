package tiendien;

public class Customer {
    private String type,ID;
    private long old,recent,exceed,money,number,total;
    public Customer(){
        
    }
    public Customer(int id,String type,long old,long recent){
        if(id<10) this.ID = "KH0" + id;
        else this.ID = "KH" + id;
        this.type = type;
        this.old = old;
        this.recent = recent;
        setNumber();
        setMoney();
        setExceed();
        this.total = money + exceed;
    }
    
    private void setMoney(){
        money = (recent - old)*number*550;
    }
    
    private void setNumber(){
        if(type.equals("KD")) number = 3;
        else if(type.equals("NN")) number = 5;
        else if(type.equals("TT")) number = 4;
        else number = 2;
    }
    
    private void setExceed(){
        long temp = recent - old;
        if(temp > 100) exceed = money;
        else if(temp >= 50) exceed = Math.round(money*(35/100.0));
        else exceed = 0;
    }
    
    public void show(){
        System.out.printf("%s %d %d %d %d\n",ID,number,money,exceed,total);
    }
}
