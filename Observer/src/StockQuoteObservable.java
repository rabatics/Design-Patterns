import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StockQuoteObservable extends Observable{
public StockQuoteObservable(ArrayList<Observer> ob) {
		super(ob);
		this.map=new HashMap<String,Float>();
		// TODO Auto-generated constructor stub
	}

private Map<String,Float> map;

public void setMap(HashMap<String,Float> m){
	this.map=m;
}

public void changeQuote(String t,float q){
	this.map.put(t, q);
	setChanged();
	super.notifyObservers(new StockEvent(t,q));
}




}
