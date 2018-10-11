import java.lang.Math;
public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other){
    return Math.sqrt(Math.pow((this.x - other.x),2) + Math.pow((this.y - other.y),2));
  }

  public static double distance(Point one, Point two){
    return Math.sqrt(Math.pow((one.getX()-two.getX()),2)+Math.pow((one.getY()-two.getY()),2));
  }


}
