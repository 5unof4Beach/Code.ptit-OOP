package loppoint;

/**
 *
 * @author suckm
 */
public class Triangle {
    private Point x = new Point(),y= new Point(),z= new Point();

    public Triangle(String x,String y,String z) {
        String a[] = x.split(" ");
        this.x.setX(Double.valueOf(a[0]));
        this.x.setY(Double.valueOf(a[1]));

        a = y.split(" ");
        this.y.setX(Double.valueOf(a[0]));
        this.y.setY(Double.valueOf(a[1]));
        
        a = z.split(" ");
        this.z.setX(Double.valueOf(a[0]));
        this.z.setY(Double.valueOf(a[1]));
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
