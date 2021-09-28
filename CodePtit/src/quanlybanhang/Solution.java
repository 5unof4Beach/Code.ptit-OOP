package quanlybanhang;

import java.util.Scanner;
import java.util.Vector;

public class Solution{
    private Vector<Customer> customer = new Vector<Customer>();
    private Vector<Product> product = new Vector<Product>();
    private Vector<Bill> bill = new Vector<Bill>();
        
    public void getInput(){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String dob = sc.nextLine();
            String address = sc.nextLine();
            Customer temp = new Customer(i, name, gender, dob, address);
            customer.add(temp);
        }
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
    
    public void processAndShow1(){
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
    
    public void processAndShow2(){
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
            i.setProfit();
        }
        bill.sort((i1,i2)->Long.compare(i2.getProfit(), i1.getProfit()));
        for(Bill i:bill){
            i.show2();
        }
    }
}
