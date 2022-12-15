package dec15th;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProblemStatement3 {
	//Creating HashMap M1
	private HashMap<String,String> M1;
String CountryMap;
ProblemStatement3(){

	 M1 = new HashMap<String,String>();
}
//Method 1
public HashMap<String,String>
 storeCountryCapital(String CountryName, String capital) {
	M1.put(CountryName, capital);
	return M1;
}
	
	
	// Method 2
	public String retrieveCapital(String CountryName) {
		return M1.get(CountryName);
		
	}
	// Method 3
	public String retrieveCountry(String capitalName) {
		Set<Entry<String,String>> set = M1.entrySet();
		Iterator<Entry<String,String>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			if(me.getValue().equals(capitalName));
			return me.getKey();			
	}
		return null;
}
	public HashMap<String,String> swapkeyValue(){
		HashMap<String,String> M2 = new HashMap<String,String>();
		
		Set<Entry<String,String>> set = M1.entrySet();
		Iterator<Entry<String,String>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		return M2;
	}
	// ArrayList
	public ArrayList<String> toArrayList(){
		ArrayList<String> list = new ArrayList<String>();
		
		Set<Entry<String,String>> set = M1.entrySet();
		Iterator<Entry<String,String>> it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		return list;
	}
public static void main(String[] args) {
	ProblemStatement3 c = new ProblemStatement3();
	
// calling Method 1 - storeCountryCapital() 
	System.out.println(c.storeCountryCapital("India", "Delhi"));
	System.out.println(c.storeCountryCapital("Japan", "Tokyo"));
	
// calling Method 2 - retrieveCapital()
	System.out.println(c.retrieveCapital("India"));
	
// calling Method 2 - retrieveCountry 
	System.out.println(c.retrieveCountry("Tokyo"));
	
	HashMap<String,String> M2 = c.swapkeyValue();
	System.out.println(M2);
}
}

