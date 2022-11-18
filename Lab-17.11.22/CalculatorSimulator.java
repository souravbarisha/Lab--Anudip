package nov17th;
// CountryNotValidException
class CountryNotValidException extends Exception{
	public CountryNotValidException(String str) {
		super(str);
	}
	}
	//EmployeeNameInvalidException
class EmployeeNameInvalidException extends Exception{
	public EmployeeNameInvalidException(String st) {
		super(st);
	}
}
    //TaxNotEligibleException
 class TaxNotEligibleException extends Exception {
	public TaxNotEligibleException(String s) {
		super(s);
	}
}
 class TaxCalculator {

	double taxAmount;
	 void calculateTax (String empName,double empSal, boolean isIndian ) throws Exception {
		if(isIndian == false) {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		}
		
		if(empName == null) {
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}
		if((empSal >100000) &&(isIndian == true)) {
			taxAmount = empSal *8/100;
			System.out.println("Tax amount : "+taxAmount);
		}
		if(isIndian == true) {
			if(empSal >100000) {
				taxAmount = empSal *8/100;
				System.out.println("Tax amount : "+taxAmount);
			}
			else if((empSal>=50000) && (empSal<=100000)) {
				taxAmount = empSal * 6/100;
				System.out.println("Tax amount : "+taxAmount);
			}
			else if((empSal>=30000) && (empSal<50000)) {
				taxAmount = empSal * 5/100;
				System.out.println("Tax amount : "+taxAmount);
			}
			else if((empSal>=10000) && (empSal<300000)) {
				taxAmount = empSal * 4/100;
				System.out.println("Tax amount : "+taxAmount);
			}
			else {
				throw new TaxNotEligibleException("The employee does not need to pay tax");
			}
			
		}
		
		
		
	}
}
	
public class CalculatorSimulator {
public static void main(String [] args) throws Exception {
	TaxCalculator tc = new TaxCalculator();
	
//	tc.calculateTax("Ron",34000,false);
//	tc.calculateTax("Tim",1000,true);
	tc.calculateTax("Jack",55000,true);
	tc.calculateTax("",30000,true);
}
}
