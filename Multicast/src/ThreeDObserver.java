
public class ThreeDObserver implements StockEventObserver,BondEventObserver {

	
	public void updateStock(StockQuoteObservable obs,StockEvent se) {
		// TODO Auto-generated method stub
		
		System.out.println("3D Stock Event Observer updated:"+se.getTicker()+" - "+se.getQuote());
	}

	@Override
	public void updateBond(BondQuoteObservable obs, BondEvent se) {
		// TODO Auto-generated method stub
		System.out.println("3D Bond Event Observer updated:"+se.getTicker()+" - "+se.getQuote());
	}

}
