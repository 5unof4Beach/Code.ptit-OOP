package khonggianbachieu;

public class Point3D {
    private int x, y, z;

    public Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point3D(Point3D tmp){
        this.x = tmp.x;
        this.y = tmp.y;
        this.z = tmp.z;
    }
    public Point3D Vector(Point3D p){
        return Vector(this, p);
    }
    public Point3D Vector(Point3D p1, Point3D p2){
        int X = p2.x - p1.x;
        int Y = p2.y - p1.y;
        int Z= p2.z - p1.z;
        Point3D tmp = new Point3D(X,Y,Z);
        return tmp;
    }
    public Point3D surface(Point3D p){
        return surface(this, p);
    }
    public Point3D surface(Point3D p1, Point3D p2){
        int X = p1.y*p2.z - p1.z*p2.y;        
        int Y = p1.z*p2.x - p1.x*p2.z;
        int Z = p1.x*p2.y - p1.y*p2.x;
        Point3D tmp = new Point3D(X,Y,Z);
        return tmp;
    }
    public long nhan(Point3D p){
        return this.x*p.x + this.y*p.y + this.z*p.z;
    }
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4){
        Point3D tmp1 = p1.Vector(p2);
        Point3D tmp2 = p1.Vector(p3);
        Point3D tmp3 = p1.Vector(p4);
        p1 = tmp1.surface(tmp2);
        long res = tmp3.nhan(p1);
        if(res == 0) return true;
        return false;
    }
}