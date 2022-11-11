package nov10th;

import java.util.StringTokenizer;

//Write a program which creates a String “C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. It parses the string with the delimiter as ‘\’ and displays the String in the following format.
//Drive: c:\
//Folders: IBM || DB2 || PROGRAM 
//File: DB2COPY1.EXE
//
//Hint:  Use String Builder for concatenating the folder names with |.
public class StringBuilderAPI {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
		System.out.println("Drive: "+str.substring(0,3));
		System.out.println("Folder: "+ str.substring(3,6).concat("||")+ str.substring(7,10)+ str.substring(11,18));
		System.out.println("File: "+str.substring(20));
				
	
	
	
	}
}
