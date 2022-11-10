package nov10th;

import java.util.StringTokenizer;

//Write a program which creates a String “C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. It parses the string with the delimiter as ‘\’ and displays the String in the following format.
//Drive: c:\
//Folders: IBM || DB2 || PROGRAM 
//File: DB2COPY1.EXE
//
//Hint:  Use String Builder for concatenating the folder names with |.
public class StringBuilderAPI {
	public static void show() {// show method
		StringTokenizer str1 = new StringTokenizer("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
		while(str1.hasMoreTokens()) {
			System.out.println(str1.nextToken("\\"));
				
			}
		}
	
	
	public static void main(String[] args) {
		show();
	}
}
