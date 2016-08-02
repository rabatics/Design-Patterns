
public class StockEvent {
private String ticker;
private float quote;




public StockEvent(String t,float q){
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