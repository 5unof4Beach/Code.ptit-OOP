package codeptit;

import java.util.Scanner;
import java.util.Vector;



public class HinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Point> points = new Vector<>();
        for(int i=0;i<4;i++){
            Point p = new Point(Integer.parseInt(sc.next()),Integer.parseInt(sc.next()));
            points.add(p);
        }
        points.sort((i1,i2) -> Integer.compare(i2.getX(), i1.getX()));
        int length = points.firstElement().getX() - points.lastElement().getX();
        points.sort((i1,i2) -> Integer.compare(i2.getY(), i1.getY()));
        int height = points.firstElement().getY() - points.lastElement().getY();
        int max = Math.max(length, height);
        System.out.println(max * max);
    }
}


class Point {
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    @Override
    public String toString(){
        return x +" "+y;
    }
}
