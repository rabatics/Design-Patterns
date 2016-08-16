import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
private Singleton(){}
private static Singleton instance=null;
private static ReentrantLock lock=new ReentrantLock();

public static Singleton getInstance(){ 
	lock.lock(); 
	try{
	if(instance==null) {
		System.out.println("Creating new instance");
		instance = new Singleton (); 
	}else{
		System.out.println("Using same instance");
	}
	}finally{
	lock.unlock(); 
	}
	return instance; 
	} 




public static void main(String[] args){
	Runnable r=()->{
		Singleton s=Singleton.getInstance();
	/*	try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	};
	
	for(int i=0;i<20;i++){
		Thread t=new Thread(r);
		t.start();
		System.out.println(Singleton.getInstance());
	}
	//System.out.println(Singleton.getInstance());

	
	
}
}
