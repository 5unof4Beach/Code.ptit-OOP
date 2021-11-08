
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;
import java.util.Calendar;
import java.util.TreeSet;


class Customer {
    private String ID,name,gender,dob,address;

    public Customer(int id, String name, String gender, String dob, String address) {
        if(id<10) ID = "KH00" + id;
        else ID = "KH0" + id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getID() {
        return ID;
    }
    
    
}

public class Main {
    public static final String INPUT_TABLE = "input";
    public static final String ID = "_id";
    public static final String AMOUNT  = "amount";
    public static final String NOTE  = "note";
    public static final String CATEGORY  = "category";
    public static final String TYPE  = "type";
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ObjectOutputStream dout = new ObjectOutputStream(new FileOutputStream("DATA2.in"));
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            l.add(sc.nextInt());
        }
        dout.writeObject(l);
        dout.close();
    }
}

class Solution{
    private Vector<Customer> customer = new Vector<Customer>();
    private Vector<Product> product = new Vector<Product>();
    private Vector<Bill> bill = new Vector<Bill>();
        
    public void getInput() throws FileNotFoundException{
        Scanner sc = new Scanner(new File("KH.in"));

        int n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String dob = sc.nextLine();
            String address = sc.nextLine();
            Customer temp = new Customer(i, name, gender, dob, address);
            customer.add(temp);
        }
        sc = new Scanner(new File("MH.in"));
        n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            String name = sc.nextLine();
            String unit = sc.nextLine();
            Long importPrice = sc.nextLong();
            Long sellPrice = sc.nextLong();
            sc.nextLine();
            Product temp = new Product(i, name, unit, importPrice, sellPrice);
            product.add(temp);
        }
        sc = new Scanner(new File("HD.in"));
        n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            String cusID = sc.next();
            String proID = sc.next();
            long amount = sc.nextLong();
            sc.nextLine();
            Bill temp = new Bill(i,cusID,proID,amount);
            bill.add(temp);

        }
    }
    
    public void processAndShow(){
        for(Bill i:bill){
            for(Customer j:customer){
                if(i.getCustomerID().equals(j.getID())){
                    i.setCustomer(j);
                }
            }
            for(Product j:product){
                if(i.getProductID().equals(j.getID())){
                    i.setProduct(j);
                }
            }
            i.show1();
        }
    }
}

/**
 *
 * @author suckm
 */
class Product {
    private String ID,name,unit;
    private long importPrice,sellPrice;

    public Product(int id, String name, String unit, long importPrice, long sellPrice) {
        if(id<10) ID = "MH00" + id;
        else ID = "MH0" + id;
        this.name = name;
        this.unit = unit;
        this.importPrice = importPrice;
        this.sellPrice = sellPrice;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public long getImportPrice() {
        return importPrice;
    }

    public long getSellPrice() {
        return sellPrice;
    }

    
}


class Bill {
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


class WordSet {
    private TreeSet<String> a;

    public WordSet(String s) {
        this.a = new TreeSet<>();
        String []ds = s.toLowerCase().split(" ");
        for (String d : ds) {
            this.a.add(d);
        }
    }
    public WordSet union(WordSet b){
        TreeSet<String> h = new TreeSet<>();
        for (String i : this.a) {
            h.add(i);
        }
        for (String i : b.a) {
            h.add(i);
        }
        String tmp="";
        for (String i : h) {
            tmp+=i+" ";
        }
        return new WordSet(tmp);
    }
    public WordSet intersection(WordSet b){
        TreeSet<String> h = new TreeSet<>();
        for (String i : a) {
            if(b.a.contains(i))
                h.add(i);
        }
        
        String tmp="";
        for (String i : h) {
            tmp+=i+" ";
        }
        return new WordSet(tmp);
    }
    @Override
    public String toString() {
        String tmp="";
        for (String i : a) {
            tmp+=i+" ";
        }
        return tmp.toString();
    }
    
}
