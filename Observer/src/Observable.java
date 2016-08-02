import java.util.ArrayList;

public class Observable {
private ArrayList<Observer> obs;
private boolean changed;


public Observable(ArrayList<Observer> ob){
	this.obs=ob;
}

public void addObserver(Observer o){
	this.obs.add(o);
}

public void  clearChanged() {
	this.changed=false;
}

public void setChanged() {
	this.changed = true;
}

public void notifyObservers(Object o){
	if(hasChanged()){
		for(Observer ob : this.getObservers()){
		ob.update(this, o);}
		clearChanged(); 
		}
}




public boolean hasChanged(){
	return this.changed;
}

public ArrayList<Observer> getObservers(){
	return this.obs;
}


public static void main(String[] args){
	ArrayList<Observer> oarr=new ArrayList<Observer>();
	oarr.add(new PieChartObserver());
	oarr.add(new TableObserver());
	oarr.add(new ThreeDObserver());
	StockQuoteObservable sqo=new StockQuoteObservable(oarr);
	sqo.changeQuote("IBM", 40);
	sqo.changeQuote("Apple", 30);
	sqo.changeQuote("Facebook", 50);
	sqo.changeQuote("IBM", 70);
	sqo.changeQuote("Google", 60);
	sqo.changeQuote("Samsung", 25);
	
}





}
