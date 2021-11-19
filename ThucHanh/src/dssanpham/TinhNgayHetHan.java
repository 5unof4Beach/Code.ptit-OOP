package dssanpham;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author suckm
 */
public class TinhNgayHetHan {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String,Product> pr = new HashMap<>();
        Vector<Customer> customers = new Vector<>();
        while(t-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            Product p = new Product(id, name, price, days);
            pr.put(id, p);
        }
        
        t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<=t;i++){
            String name = sc.nextLine();
            String add = sc.nextLine();
            String proID = sc.nextLine();
            Long amount = Long.parseLong(sc.nextLine());
            String buyDate = sc.nextLine();
            Customer c = new Customer(i, name, add, amount, buyDate);
            c.setP(pr.get(proID));
            c.setED();
            customers.add(c);
        }
        customers.sort((i1,i2) -> i1.getId().compareTo(i2.getId()));
        customers.sort((i1,i2) -> i1.getEndDate().compareTo(i2.getEndDate()));
            
        for(Customer i:customers){
            i.show();
        }
    }
}


class Product {
    private String id, name;
    private int price, day;

    public Product(String id, String name, int price, int day) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.day = day;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getDay() {
        return day;
    }
    
    public void show(){
        System.out.printf("%s %s %d %d\n", id, name, price, day);
    }
}

class Customer{
    private String name, add, id, endDate;
    private long amount, pay;
    private Date buyDate, ed;
    private Product p;

    public Customer(int i, String name, String add, long amount, String buyDate) throws ParseException {
        this.id = String.format("KH%02d", i);
        this.name = name;
        this.add = add;
        this.amount = amount;
        this.buyDate = new SimpleDateFormat("dd/MM/yyyy").parse(buyDate);
    }

    public void setP(Product p) {
        this.p = p;
    }

    public void setPay() {
        this.pay = amount * p.getPrice();
    }
    
    public void setEndDate(){
        int month = buyDate.getMonth() + 1 + p.getDay();
        int year = buyDate.getYear() + 1900;
        while(month > 12){
            month -= 12;
            year += 1;
        }
        
        endDate = String.format("%02d",buyDate.getDate()) + "/" + String.format("%02d",month) + "/" + String.format("%02d",year);
    }

    public String getId() {
        return id;
    }
    
    public void setED() throws ParseException{
        setEndDate();
        ed = new SimpleDateFormat("dd/MM/yyyy").parse(endDate); 
    }
    
    public Date getEndDate(){
        return ed;
    }
    
    public void show(){
        setPay();
        setEndDate();
        System.out.printf("%s %s %s %s %d %s\n",id, name, add, p.getId(), pay, endDate);
    }
}
