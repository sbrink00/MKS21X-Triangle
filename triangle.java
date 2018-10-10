import java.lang.Math;
public class triangle{
  private Point v1;
  private Point v2;
  private Point v3;

  public triangle(Point p1, Point p2, Point p3){
    v1 = p1;
    v2 = p2;
    v3 = p3;
  }



  public void printTriangle(){
    System.out.println("v1: ("+v1.getX()+", "+v1.getY()+")");
    System.out.println("v2: ("+v2.getX()+", "+v2.getY()+")");
    System.out.println("v3: ("+v3.getX()+", "+v3.getY()+")");
  }



  public double perimeter(){
    return Point.distance(v1,v2)+Point.distance(v1,v3)+Point.distance(v2,v3);
  }

}
