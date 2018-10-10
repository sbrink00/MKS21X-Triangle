public class demo{
  public static void main (String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);
    triangle t1 = new triangle(new Point(0,0), new Point(0,3), new Point(4,3));
    //for the 3 distance functions below Determine:
    //a)static/non-static
    //b)what class the method is located in
    System.out.println(distance(P1,P2));//static because call is static. Located in demo because it isn't called by a point or triangle, it is simply called in demo class.
    System.out.println(Point.distance(P1,P2)); //static  because this call is static. Located in Point because you call it using the point class.
    System.out.println(P1.distanceTo(P2)); //non static because call isn't static. Located in Point class because the object that calls it is a point.
    t1.printTriangle();
    System.out.println(t1.perimeter());
  }
  public static double distance(Point first, Point second){
    return Math.sqrt(Math.pow((first.getX()-second.getX()),2)+Math.pow((first.getY()-second.getY()),2));
  }
}
