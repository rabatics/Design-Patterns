import java.awt.Point;
import java.util.ArrayList;


public class RectangleAreaCalculator implements AreaCalculator {
 //   private int nop=4;
  // private Point[] p;
	
  /* public Rectangle(Point ul,Point ur,Point ll,Point lr){
      p=(new Point[] {ul,ur,ll,lr});
    	}  */
    
  
   
    
    
 /*   public  Point[] getPoints(){
    	
    	/*String points ="Points-->";
    	for(int i=0;i<p.length;i++){
    		points=points+"("+p[i].getX()+","+p[i].getY()+")";
    	}    	return this.p;
    }*/
    
    
    @Override
    public float getArea(ArrayList<Point> p){
    	
    	float l=(float)Point.distance(p.get(0).getX(),p.get(0).getY(),p.get(1).getX(), p.get(1).getY());
    	
    	
    	float b=(float)Point.distance(p.get(1).getX(),p.get(1).getY(),p.get(2).getX(), p.get(2).getY());
    	
    	return l*b;
    }

	
	

}
