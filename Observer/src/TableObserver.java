
public class TableObserver implements Observer {

	
	public void update(Observable obs,Object o) {
		// TODO Auto-generated method stub
		StockEvent se=(StockEvent) o;
		System.out.println("Table Observer updated:"+se.getTicker()+" - "+se.getQuote());
	}

}
