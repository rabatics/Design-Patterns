import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class BondQuoteObservable {
	

	

	private ArrayList<BondEventObserver> obs;
	private boolean changed;


	public BondQuoteObservable(ArrayList<BondEventObserver> ob){
		this.obs=ob;
		this.map=new HashMap<String,Float>();
	}

	public void addObserver(BondEventObserver o){
		this.obs.add(o);
	}

	public void  clearChanged() {
		this.changed=false;
	}

	public void setChanged() {
		this.changed = true;
	}

	public void notifyObservers(BondEvent o){
		if(hasChanged()){
			for(BondEventObserver ob : this.getObservers()){
			ob.updateBond(this, o);}
			clearChanged(); 
			}
	}




	public boolean hasChanged(){
		return this.changed;
	}

	public ArrayList<BondEventObserver> getObservers(){
		return this.obs;
	}

	private Map<String,Float> map;

	public void setMap(HashMap<String,Float> m){
		this.map=m;
	}

	public void changeQuote(String t,float q){
		this.map.put(t, q);
		setChanged();
		notifyObservers(new BondEvent(this,t,q));
	}

	public void randomChange(){
		
	}



	


public static void main(String[] args) throws InterruptedException {
	ArrayList<String> comp=new ArrayList<String>();
	comp.add("IBM");
	comp.add("Apple");
	comp.add("Microsoft");
	comp.add("Google");
	comp.add("Facebook");
	comp.add("Samsung");
	
	ArrayList<BondEventObserver> oarrb=new ArrayList<BondEventObserver>();
	oarrb.add(new PieChartObserver());
	oarrb.add(new TableObserver());
	oarrb.add(new ThreeDObserver());
	ArrayList<StockEventObserver> oarrs=new ArrayList<StockEventObserver>();
	oarrs.add(new PieChartObserver());
	oarrs.add(new TableObserver());
	oarrs.add(new ThreeDObserver());
	BondQuoteObservable bqo=new BondQuoteObservable(oarrb);
	for(int i=0;i<10;i++){
		Collections.shuffle(comp);
		float num=(float)Math.random();
		System.out.println(comp.get(0)+" has changed to:"+num);
		bqo.changeQuote(comp.get(0), num);
		System.out.println();
		Thread.sleep(2000);
	}
	System.out.println();
	System.out.println();

	StockQuoteObservable sqo=new StockQuoteObservable(oarrs);
	for(int i=0;i<10;i++){
		Collections.shuffle(comp);
		float num=(float)Math.random();
		System.out.println(comp.get(0)+" has changed to:"+num);
		sqo.changeQuote(comp.get(0), num);
		System.out.println();
		Thread.sleep(2000);
	}
		
	
	
}





}
