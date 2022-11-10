package nov10th;

import java.util.Scanner;

//Write a Java program to find sequences of lowercase letters joined with a underscore.
public class CeckLowerCaseOrNot {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("write a string");
	String str = sc.nextLine();
	boolean flag = false;
	for(int i=0;i<str.length(); i++) {
		if(str.charAt(i)=='_') {
			char next = str.charAt(i+1);
			
			if(Character.isLowerCase(next)) {
				flag = true;
				break;
			}
		}
		
	}
	if(flag) {
		System.out.println("matched");
	}
	else {
		System.out.println("not matched");
	}
}
}
