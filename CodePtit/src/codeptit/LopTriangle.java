package loppoint;

import java.util.Scanner;

/**
 *
 * @author suckm
 */
public class LopTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}



class Triangle {
    private Point x = new Point(),y= new Point(),z= new Point();

    public Triangle(String x,String y,String z) {
        String a[] = x.split(" ");
        this.x.setX(Integer.valueOf(a[0]));
        this.x.setY(Integer.valueOf(a[1]));

        a = y.split(" ");
        this.y.setX(Integer.valueOf(a[0]));
        this.y.setY(Integer.valueOf(a[1]));
        
        a = z.split(" ");
        this.z.setX(Integer.valueOf(a[0]));
        this.z.setY(Integer.valueOf(a[1]));
    }
    
    public boolean valid(){
        double xy = x.distance(y);
        double yz = y.distance(z);
        double zx = z.distance(x);
        if(xy + yz <= zx ||
           xy + zx <= yz ||
           yz + zx <= xy){
            return false;
        }
        return true;
    }
    
    public String getPerimeter(){
        double xy = x.distance(y);
        double yz = y.distance(z);
        double zx = z.distance(x);
        return String.format("%.3f", xy + yz + zx);
    }
}


class Point {
    private double x,y;
    
    public Point(){
        this.x = 1;
        this.y = 1;
    }
    public Point(double x , double y){
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p){
        this.x = p.getX();
        this.y = p.getY();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double distance(Point secondPoint){
        return distance(secondPoint, this);
    }
    
    public double distance(Point p1,Point p2){
        double deltaX = Math.abs(p1.getX() - p2.getX());
        double deltaY = Math.abs(p1.getY() - p2.getY());
        return(Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
    }
    
    public static String nextPoint(Scanner sc){
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        return a + " " + b;
    }
}

