package demo;

public class TestTax {
	public static void main(String[] args) 
	{
		Tax t = new Tax();
		t.grossIncome = 50000;
		t.dependents = 2;
		t.stat = "NJ";
		
		double yourTax = t.calcTax();
		System.out.println("Your tax is " + yourTax);;
	}
}
