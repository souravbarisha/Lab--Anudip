package dec01st;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Problem2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Press "+ 1 +" Or Press "+ 2);
	
	int num = sc.nextInt();
	switch(num) {
	case 1: 
		try {
			FileOutputStream wr = new FileOutputStream("D:\\anudip\\lab1.txt");
			//BufferedOutputStream b = new BufferedOutputStream(wr);
			System.out.println("write some thing");
			String s = sc.next();
			byte b1[] = s.getBytes(); // converting string into byte array	
			 wr.write(b1);
		}
		catch(Exception e) {
			System.out.println(e);
		} 
		break;
	case 2:
		try {
			FileInputStream re = new FileInputStream("D:\\anudip\\lab1.txt");
	 		//BufferedInputStream bb = new BufferedInputStream(re);
	 		
				if(re!=null) {
					 int i = 0;
		 		while((i=re.read())!=-1) {
		 			System.out.println((char)i);
		 		} }
			else {
					System.out.println("file is empty");
				}
		}
		catch(Exception e) {
			System.out.println(e);
		} 
		break;
	default:	
		System.out.println("enter valid press");
	}
	
}
}
