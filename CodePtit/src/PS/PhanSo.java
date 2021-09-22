/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PS;

/**
 *
 * @author suckm
 */
public class PhanSo {
    
    private long tu,mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
    }
    
    public String toString(long tu , long mau){
        return tu + "/" + mau;
    }
    public void rutGon(){
        long GCD = gcd(this.tu,this.mau);
        this.tu = this.tu/GCD;
        this.mau = this.mau/GCD;
//        System.out.println(toString(this.tu/GCD, this.mau/GCD));
    }
    
    public long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public PhanSo sum(PhanSo p){
        long m = this.mau * p.getMau();
        long t = this.tu*p.getMau() + p.getTu()*this.mau;
        return new PhanSo(t, m);
    }
    public PhanSo sum(PhanSo p1,PhanSo p2){
        p1.rutGon();
        p2.rutGon();
        long m = p1.getMau() * p2.getMau();
        long t = p1.getTu()*p2.getMau() + p1.getMau()*p2.getTu();
        return new PhanSo(t, m);
    }
    
    public PhanSo multiply(PhanSo p){
        this.rutGon();
        p.rutGon();
        long m = this.mau * p.getMau();
        long t = this.tu*p.getTu();
        return new PhanSo(t, m);
    }
    
    public PhanSo pow(PhanSo p){
        p.rutGon();
        long t = p.getTu() * p.getTu();
        long m = p.getMau() * p.getMau();
        return new PhanSo(t,m);
    }
    public void show(){
        System.out.printf("%d/%d ",this.tu,this.mau);
    }
}
