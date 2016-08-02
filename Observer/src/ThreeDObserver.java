
public class ThreeDObserver implements Observer{

	
	public void update(Observable obs,Object o) {
		// TODO Auto-generated method stub
		StockEvent se=(StockEvent) o;
		System.out.println("3D Observer updated:"+se.getTicker()+" - "+se.getQuote());
	}

}
