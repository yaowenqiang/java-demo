package demo;

public class Tax {
	double grossIncome;
	String stat;
	int dependents;
	
	public double calcTax()
	{
		if (grossIncome < 50000) {
			return grossIncome * 0.05;
		} else {
			return grossIncome * 0.08;
		}
//		return 234.55;
	}
	
}
