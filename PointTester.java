import java.awt.Point;
public class PointTester {
    
    public static void main(String[] args) {
        Point p = new Point(2,5);
        System.out.println(p.toString());

        p.setLocation(p.getY(), p.getX());
        System.out.println(p.toString());

        Point q = new Point();
        q.setLocation(p.getX(), p.getY());
        System.out.println("Are the p and q equal? " + p.equals(q));

    }

}