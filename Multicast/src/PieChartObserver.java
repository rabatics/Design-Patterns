
public class PieChartObserver implements StockEventObserver,BondEventObserver {

	public void updateStock(StockQuoteObservable obs,StockEvent se){
		
		System.out.println("PieChart Stock Event Observer updated:"+se.getTicker()+" - "+se.getQuote());
		
	}

	@Override
	public void updateBond(BondQuoteObservable obs, BondEvent se) {
		// TODO Auto-generated method stub
		System.out.println("PieChart Bond Event Observer updated:"+se.getTicker()+" - "+se.getQuote());
	}
	
}
