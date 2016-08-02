
public class TableObserver implements StockEventObserver,BondEventObserver {

	
	public void updateStock(StockQuoteObservable obs,StockEvent se) {
		// TODO Auto-generated method stub
		
		System.out.println("Table Stock Event Observer updated:"+se.getTicker()+" - "+se.getQuote());
	}

	@Override
	public void updateBond(BondQuoteObservable obs, BondEvent se) {
		// TODO Auto-generated method stub
		System.out.println("Table Bond Event Observer updated:"+se.getTicker()+" - "+se.getQuote());
	}

}
