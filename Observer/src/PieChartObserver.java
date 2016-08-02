
public class PieChartObserver implements Observer {

	public void update(Observable obs,Object o){
		StockEvent se=(StockEvent) o;
		System.out.println("PieChart Observer updated:"+se.getTicker()+" - "+se.getQuote());
		
	}
	
}
