package nov10th;
/*Write a Java program to remove duplicate characters from a given string presents in another given string. 
Sample Output: 
The given String is: Anudip Foundation Skill & career development centre.
The given mask string is – Famous
The new string is: Without all letters  */

public class DuplicateCharacter {
public static void main(String[] args) {
  // 1ST STRING
	 String str1 = "Anudip Foundation Skill & career development centre";
	 //2ND STRING
	  String str2 = "Famous";
	  // print both string
	  System.out.println("The given string is: " + str1);
	  System.out.println("The given mask string is: " + str2);
	  // create character array 
	/*  char arr[] = new char[str1.length()];
	  char[] mask = new char[256];
	  // iteration
	  for (int i = 0; i < str2.length(); i++)
	   mask[str2.charAt(i)]++;
	  // print new string
	  System.out.println("The new string is: ");
	  for (int i = 0; i < str1.length(); i++) {
	   if (mask[str1.charAt(i)] == 0) // condition to checking same character
	    System.out.print(str1.charAt(i)); // print
	  } */
	
	  boolean flag = false;
	  for(int i=0;i<str1.length();i++) {
		    for(int j=0;j<str2.length();j++) {
			  if (Character.toLowerCase(str1.charAt(i)) == Character.toLowerCase(str2.charAt(j))){
				  flag = true;
				  break;
			  }
		  }
		  if(flag== false) {
			  System.out.println("new string is: "+ str1.charAt(i));
		  }
	  }
	
	}
}
