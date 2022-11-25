package nov24th;

import java.util.ArrayList;

class ListLoader implements Runnable{
	int startNumber, lastNumber;
	ListLoader(int sn, int ln){
		this.startNumber = sn;
		this.startNumber = ln;
	}
	public void run() {
	ArrayList<Integer> L = new ArrayList<Integer>();
	 	
		for(int i = startNumber; i<lastNumber; i++) {
			L.add(i);
		}
		for(int j : L) {
			System.out.println(j);
		}
		
	}
}


public class CalculateResponseTime {
	
public static void main(String[] args) throws InterruptedException {
	Runnable r = new ListLoader(0,100); // creating an object
	Thread t = new Thread(r);
	int start , last ; 
	// time taken before executing 
	start =(int) System.currentTimeMillis();
	System.out.println("response time taken before executing  "+start); 
	
	t.start(); // invoke the run()
	t.join();
	// time taken after executing 
	
	last = (int) System.currentTimeMillis();
	System.out.println("response time taken before executing  "+last);
	// Difference
	System.out.println("response time : "+(last - start));
}
}

