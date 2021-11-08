package loppoint;

import java.util.LinkedList;
import java.util.Vector;

/**
 *
 * @author suckm
 */
public class Polygon {
    private LinkedList<Point> points = new LinkedList<>();

    public Polygon(Point[] points) {
        for(Point i:points){
            this.points.add(i);
        }
    }
    
    public String getArea(){
        int sum_1 = 0;
        int sum_2 = 0;
        for(int i=0;i<points.size()-1;i++){
            sum_1 += points.get(i).getX() * points.get(i+1).getY();
            sum_2 += points.get(i).getY() * points.get(i+1).getX();
        }
        sum_1 += points.getLast().getX() * points.getFirst().getY();
        sum_2 += points.getLast().getY() * points.getFirst().getX();
        Double Area = (sum_1-sum_2)/2.0;
        return String.format("%.3f",Area);
    }
}
