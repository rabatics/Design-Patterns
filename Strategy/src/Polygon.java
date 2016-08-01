import java.awt.Point;
import java.util.ArrayList;

public class Polygon {
private ArrayList<Point> p=new ArrayList<Point>();
private AreaCalculator ac;


public Polygon(ArrayList<Point> p,AreaCalculator ac){
	this.p=p;
	this.ac=ac;
}

public float getArea(){
	return ac.getArea(p);
}
public void setAreaCalculator(AreaCalculator ac1){
	this.ac=ac1;
}

public void addPoint(Point a){
	this.p.add(a);
}

public static void main(String[] args){
	ArrayList<Point> pl=new ArrayList<Point>();
	pl.add(new Point(0,0));
	pl.add(new Point(4,0));
	pl.add(new Point(4,4));
	Polygon p=new Polygon(pl,new TriangleAreaCalculator());
	System.out.println("Area of Triangle:"+p.getArea());
	
	p.addPoint(new Point(0,4));
	p.setAreaCalculator(new RectangleAreaCalculator());
	System.out.println("Area of Rectangle after adding a Point: "+p.getArea());
}

}
