import java.awt.Point;
import java.util.ArrayList;


public class TriangleAreaCalculator implements AreaCalculator{
          private int nop=3;
         
         
          
          @Override
          public float getArea(ArrayList<Point> p){
          	
          	float a=(float)Point.distance(p.get(0).getX(),p.get(0).getY(),p.get(1).getX(), p.get(1).getY());
          	float b=(float)Point.distance(p.get(1).getX(),p.get(1).getY(),p.get(2).getX(), p.get(2).getY());
          	float c=(float)Point.distance(p.get(2).getX(),p.get(2).getY(),p.get(0).getX(), p.get(0).getY());
          	float s=(a+b+c)/2;
        
          	float area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
          	return area;
          }
          
          
}
