package loppoint;
import java.util.*;
public class TinhDienTichDaGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            
            LinkedList<Point> pointSet= new LinkedList<Point>();
            int S = Integer.parseInt(sc.nextLine());
            for(int j=0;j<S;j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                sc.nextLine();
                Point p = new Point(x,y);
                pointSet.add(p);
            }
            findArea(pointSet);
        }
    }
    
    public static void findArea(LinkedList<Point> pointSet){
        int sum_1 = 0;
        int sum_2 = 0;
        for(int i=0;i<pointSet.size()-1;i++){
            sum_1 += pointSet.get(i).getX() * pointSet.get(i+1).getY();
            sum_2 += pointSet.get(i).getY() * pointSet.get(i+1).getX();
        }
        sum_1 += pointSet.getLast().getX()*pointSet.getFirst().getY();
        sum_2 += pointSet.getLast().getY()*pointSet.getFirst().getX();
        Double Area = (sum_1-sum_2)/2.0;
        System.out.printf("%.3f\n",Area);
    }
}
