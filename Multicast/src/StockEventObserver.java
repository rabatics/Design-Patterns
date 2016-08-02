import java.util.EventListener;

public interface StockEventObserver extends EventListener {

	
	public void updateStock(StockQuoteObservable obs,StockEvent se);
	
	
}
