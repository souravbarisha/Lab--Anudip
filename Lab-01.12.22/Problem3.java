package dec01st;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;

public class Problem3 {
public static void main(String[] args) {
	
	 
	try {
		FileInputStream f1 = new FileInputStream("D:\\anudip\\lab3.txt");
		byte b[] = f1.readAllBytes();
		ByteArrayInputStream BA = new ByteArrayInputStream(b);
		 // converting string into byte array
		int i =0;
		while((i=BA.read()) !=-1) {
			char ch = (char)i;
			System.out.println(ch);
		}
	     BA.close();
	     System.out.println("done");
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
