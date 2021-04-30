
public class AccountingArrayApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply+vat;
		double expenseRate = 0.3;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		
//		double rate1 = 0.5;
//		double rate2 = 0.3;
//		double rate3 = 0.2;
		
		double[] dividenRates = new double[3];
		dividenRates[0] = 0.5;
		dividenRates[1] = 0.3;
		dividenRates[2] = 0.2;
		
		double dividend1 = income * dividenRates[0];
		double dividend2 = income * dividenRates[1];
		double dividend3 = income * dividenRates[2];
		
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ vat );
		System.out.println("Total : "+ total );
		System.out.println("Expense : "+ expense );
		System.out.println("Income : "+ income );
		System.out.println("Dividend1 : "+ dividend1 );
		System.out.println("Dividend2 : "+ dividend2 );
		System.out.println("Dividend3 : "+ dividend3 );	
		
	}

}
