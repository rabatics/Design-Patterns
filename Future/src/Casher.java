import java.util.concurrent.locks.ReentrantLock;

public class Casher {
	private static ReentrantLock lock=new ReentrantLock();
	
	
	public Pizza order(){
		Future future=new Future();
		System.out.println("Order is made");
		
		
		Runnable r=()->{
		RealPizza realPizza = new RealPizza();
			future.setRealPizza( realPizza ); 
			
		};
		new Thread(r).start();
		
		return future;
		
	}

	
	
	
	public static void main(String[] args){
		Casher casher = new Casher();
		System.out.println("Ordering pizzas at a casher counter.");
		Pizza p1 = casher.order();
		Pizza p2 = casher.order();
		Pizza p3 = casher.order();

		
		 while(true){ 
			 lock.lock(); 
			 try{
				 boolean f1 = ((Future)p1).isReady();
				 boolean f2 = ((Future)p2).isReady();
				 boolean f3 = ((Future)p3).isReady();
					if(f1){
						
						System.out.println("1 Done");
						System.out.println(((Future)p1).getPizza());
					}
					else{
						System.out.println("1 in Process");
					}
					 if(f2){
						
						System.out.println("2 Done");
						System.out.println(((Future)p2).getPizza());
					}
					 else{
							System.out.println("2 in Process");
						}
					 if(f3){
						
						System.out.println("3 Done");
						System.out.println(((Future)p3).getPizza());
					}
					 else{
							System.out.println("3 in Process");
						}
					if(f1 && f2 && f3){
						break;
					}
					System.out.println();

			 
			 }
			 finally{
				 lock.unlock();
			 }
			// System.out.println("Doing something");
		 
		 }
		 
	/*	 System.out.println("Let's see if pizzas are ready to pick up...");
			System.out.println( p1.getPizza() );
			System.out.println( p2.getPizza() );
			System.out.println( p3.getPizza() );*/

		
	}
}
	





