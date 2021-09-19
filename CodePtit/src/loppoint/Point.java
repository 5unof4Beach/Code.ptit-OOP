package loppoint;

public class Point {
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
}
