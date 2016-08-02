import java.util.EventListener;

public interface BondEventObserver extends EventListener {

	
	public void updateBond(BondQuoteObservable obs,BondEvent se);
	
	
}
