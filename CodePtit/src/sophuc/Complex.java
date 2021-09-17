package sophuc;

public class Complex {
    private int a,b;
    public Complex(int a,int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    
    public Complex(){
        a=0;
        b=0;
    }
    
    public Complex sum(Complex FirstComplex,Complex SecondComplex){
        int tempA = FirstComplex.getA() + SecondComplex.getA();
        int tempB = FirstComplex.getB() + SecondComplex.getB();
        Complex temp = new Complex(tempA,tempB);
        return temp;
    }
    public Complex sum(Complex SecondComplex){
        return sum(this,SecondComplex);
    }
    
    public Complex mul(Complex FirstComplex,Complex SecondComplex){
        int tempA = FirstComplex.getA()*SecondComplex.getA() -
                    FirstComplex.getB()*SecondComplex.getB();
        int tempB = FirstComplex.getA()*SecondComplex.getB() +
                    FirstComplex.getB()*SecondComplex.getA();
        Complex temp = new Complex(tempA,tempB);
        return temp;
    }
    public Complex mul(Complex SecondComplex){
        return mul(this,SecondComplex);
    }
    
    void show(){
        if(b<0){
            b *= -1;
            System.out.printf("%d - %di",a,b);
        }
        else
            System.out.printf("%d + %di",a,b);
    }
}
