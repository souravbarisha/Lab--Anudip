package dec15th;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProblemStatement2 {
	static String Country; // creating instant variable
	private static void storeCountryNames(HashSet<String> H1,String CountryName) {
		Country = CountryName;
		H1.add(CountryName);
		System.out.println("ADD Country: "+CountryName);
		System.out.println("Country List: "+ H1);
		
	}
	private static void retrieveCountry(HashSet<String> H1,String CountryName) {
		
		// Checking countries are exit or not
		if(H1.contains(CountryName)) {
			System.out.println("exist: "+CountryName);
		}
		else {
			System.out.println("null");
		}
	}
public static void main(String[] args) {
	
	HashSet<String> H1 = new HashSet<String>(); // creating HashSet object
	//calling storeCountryNames methods
	storeCountryNames(H1,"Brazil");
	storeCountryNames(H1,"Rassia");
	storeCountryNames(H1,"India");
	storeCountryNames(H1,"China");
	storeCountryNames(H1,"South Africa");
	//calling retrieveCountry methods
	retrieveCountry(H1,"India");
	retrieveCountry(H1,"Pakisthan");
	retrieveCountry(H1,"USA");
	retrieveCountry(H1,"Rassia");
	
}
}
