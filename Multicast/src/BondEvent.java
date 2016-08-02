import java.util.EventObject;

public class BondEvent extends EventObject{
private String ticker;
private float quote;




public BondEvent(Object o,String t,float q){
	
	super(o);
	this.setTicker(t);
	this.setQuote(q);
	
}




public String getTicker() {
	return ticker;
}




public void setTicker(String ticker) {
	this.ticker = ticker;
}




public float getQuote() {
	return quote;
}




public void setQuote(float quote) {
	this.quote = quote;
}




}