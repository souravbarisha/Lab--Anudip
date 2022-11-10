package nov10th;

public class StringBufferAPI {
public static void main(String[] args) {
	StringBuffer s = new StringBuffer("This is StringBuffer");  // object of string buffer class
	
	//1.Adds the string ”- This is a sample program” to existing string and display it.
	s.append("- This is a sample program");
	System.out.println("after adds : "+ s);  // output: This is StringBuffer- This is a sample program
	
	//2.Inserts the string “Object” into the existing string at 21st postion and display it.
	s.insert(21,"Object");
	System.out.println("after inserts : "+ s); //output: This is StringBuffer-Object This is a sample program
	
	
	//4.Replaces the word “Buffer” with “Builder” and display it.
	s.replace(14, 20, "Builder");
	System.out.println("Replaces“Buffer” with “Builder” : "+s); //This is StringBuilder-Object This is a sample program
	
	//3.Reverses the entire string and displays it.
		s.reverse();
		System.out.println("after reverse : "+ s); // output: margorp elpmas a si sihT tcejbO-reffuBgnirtS si sihT
}
}
