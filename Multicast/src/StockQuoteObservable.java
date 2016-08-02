import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StockQuoteObservable {

private ArrayList<StockEventObserver> obs;
private boolean changed;


public StockQuoteObservable(ArrayList<StockEventObserver> ob){
	this.obs=ob;
	this.map=new HashMap<String,Float>();
}

public void addObserver(StockEventObserver o){
	this.obs.add(o);
}

public void  clearChanged() {
	this.changed=false;
}

public void setChanged() {
	this.changed = true;
}

public void notifyObservers(StockEvent o){
	if(hasChanged()){
		for(StockEventObserver ob : this.getObservers()){
		ob.updateStock(this, o);}
		clearChanged(); 
		}
}




public boolean hasChanged(){
	return this.changed;
}

public ArrayList<StockEventObserver> getObservers(){
	return this.obs;
}

private Map<String,Float> map;

public void setMap(HashMap<String,Float> m){
	this.map=m;
}

public void changeQuote(String t,float q){
	this.map.put(t, q);
	setChanged();
	notifyObservers(new StockEvent(this,t,q));
}




}
