import java.lang.Math;
public class Triangle{
  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle(Point p1, Point p2, Point p3){
    v1 = p1;
    v2 = p2;
    v3 = p3;
  }

  public Triangle(double v1x, double v1y,
  double v2x, double v2y, double v3x, double v3y){
    v1 = new Point(v1x, v1y);
    v2 = new Point(v2x, v2y);
    v3 = new Point(v3x, v3y);
  }

  public String toString(){
    return "Triangle: A("+v1.getX()+", "+v1.getY()+") B("+v2.getX()+", "+v2.getY()+") C("+v3.getX()+", "+v3.getY()+")";
  }

  public Point getVertex(int idx){
    Point output;
    if (idx == 0){
      output = new Point(v1.getX(), v1.getY());
    }
    else if (idx == 1){
      output = new Point(v2.getX(), v2.getY());
    }
    else{
      output = new Point(v3.getX(), v3.getY());
    }
    return output;
  }

  public void setVertex(int index, Point newP){
    if (index == 0){
      v1 = newP;
    }
    else if (index == 1){
      v2 = newP;
    }
    else{
      v3 = newP;
    }
  }

  public double getPerimeter(){
    return Point.distance(v1,v2)+Point.distance(v1,v3)+Point.distance(v2,v3);
  }

}
