import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Future implements Pizza{
	private RealPizza realPizza = null; 
	private ReentrantLock lock; 
	private Condition ready; 
	
	public Future(){ 
		lock = new ReentrantLock(); 
		ready = lock.newCondition(); 
		}


	
	
	public void setRealPizza( RealPizza real )
	{ 
		lock.lock(); 
	if( realPizza != null )
	{ return; } 
	realPizza = real;
	ready.signalAll(); 
	lock.unlock(); 
	} 
	
	public String getPizza() { 
		String pizzaData = null; 
		lock.lock(); 
		try{
		if( realPizza == null ){ 
			
			ready.await();
			} 
		pizzaData = realPizza.getPizza(); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			lock.unlock(); 
			e.printStackTrace();
		}
		finally{
		lock.unlock(); 
		}
		return pizzaData;
		}


	public Boolean isReady(){
		lock.lock();
		try{
			
		
		if( realPizza != null )
		{ return true; } 
		else{
			return false;
		}
		}
		finally{
			lock.unlock();
		}
	}
	
	
	public String getPizza(long timeout){
		String pizzaData = null; 
		lock.lock(); 
		try{
		if( realPizza == null ){ 
			
			ready.await(timeout,TimeUnit.MILLISECONDS);
			} 
		pizzaData = realPizza.getPizza(); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			lock.unlock(); 
			e.printStackTrace();
		}
		finally{
		lock.unlock(); 
		}
		return pizzaData;
	}
	
	}
	
	

	

