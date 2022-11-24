package nov24th;
/* Problem code 3:
Build and run the project
Right click RunnableThreadTest1 project and select Run.
Observe the result in the Output window.
Output Window ACBACBACBACB AC ABCABCABCABCABC B */

public class RunnableThreadTest1 implements Runnable {
	public void run() {
		for(int i=0; i<4; i++) {
			System.out.print("ACB");
			}
		System.err.print("AC");
		
		for(int i=0; i<4; i++) {
			System.out.print("ABC");
			}
		System.out.print("B");
	}
	
public static void main(String[] args) {
	RunnableThreadTest1 R1 = new RunnableThreadTest1();
	Thread T1 = new Thread(R1);
	T1.start();
	
}
}
