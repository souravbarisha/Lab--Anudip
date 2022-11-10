package nov10th;

public class StringAPI {
public static void main(String[] args) {
	String str = "Welcome to Java World";
	int len = str.length();
	//Returns the character at 5th position and display it.
	System.out.println("the character at 5th position is: "+ str.charAt(4));  // index= position - 1 // output: o
	
	//Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
	str.toLowerCase();
	String str1 ="Welcome";
	str1.toLowerCase();
	System.out.println("comparism of two string : "+ str.equals(str1)); // false
	
	//Concatenates “- Let us learn” to the above string and display it.
	String str2 = "- Let us learn";
	String str3 = str + str2;
	System.out.println("after concatenates : "+ str3); //  Welcome to Java World- Let us learn
	
	//Returns the position of the first occurrence of character ‘a’ and display it.
	char find = 'a';
	for(int i=0; i<len; i++) {
		if(str.charAt(i) == find) {
			System.out.println("position(index) of the first occurrence of character 'a' is : "+ i);// 12 index position
			break;
		}
	}
	
	//Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
			String str4= str.replace('a', 'e');
			System.out.println("after Replace new string is : "+ str4);
			           // output:Welcome to Jeve World
	//Returns string between 4th position and 10th position and display it.
			String str5 =str.substring(3, 10); //index= position - 1
			System.out.println("string between 4th position and 10th position is : "+ str5); // output: come to
			
		//Returns the lowercase of the string and display it.
		System.out.println("the lowercase of the string : "+ str.toLowerCase()); // welcome to java world
}
}
