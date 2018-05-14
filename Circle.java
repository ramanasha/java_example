public class Circle
{
   private double radius;
  private double area;

   public Circle( )
     {
        radius = 0;
        area = 0;
     }
  public Circle( double radius )
     {
        this.radius = radius;
     }
  public double getRadius( )
     {
        return radius;
     }
  public void setRadius( double radius )
     {
        this.radius = radius;
     }
  public double getArea( )
     {
        return area;
     }
  public void setArea( double radius )
     {
        area = (radius)*(radius)*Math.PI;
     }
   public String toString( )
     {
        return "The radius of the circle is: " + radius + ", and the area is: " + area;
     }
  
 public static void main(String aa[])
 {
   Circle c = new Circle();
   c.setRadius(33);
    c.setArea(33);
   double d=c.getArea();
  
  System.out.println(d);
  System.out.println(c.getRadius()); 
 }
}
