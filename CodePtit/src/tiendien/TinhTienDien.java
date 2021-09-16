package tiendien;
import java.util.*;
public class TinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Vector<Customer> res = new Vector<Customer>();
        for(int i=1 ; i<=n ; i++){
            String type = sc.nextLine();
            long old = Long.parseLong(sc.nextLine());
            long recent = Long.parseLong(sc.nextLine());
            Customer cus = new Customer(i,type,old,recent);
            res.add(cus);
        }
        res.sort((i1,i2)->Long.compare(i2.getTotal(), i1.getTotal()));
        for(Customer i:res){
            i.show();
        }
    }
}



class Customer {
    private String type,ID;
    private long old,recent,exceed,money,number,total;

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
        else if(temp >= 50) exceed = Math.round(35*money/100.0);
        else exceed = 0;
    }

    public long getTotal() {
        return total;
    }
    
    public void show(){
        System.out.printf("%s %d %d %d %d\n",ID,number,money,exceed,total);
    }
}

