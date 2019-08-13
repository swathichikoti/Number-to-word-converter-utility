
public class NumberToWordConverterUtil {

	public static final String[] units = { "" , "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };
	
	public static final String[] tens = { "", "", "Twenty", "Thirty", "Fourty", "Fifty",
			"Sixty", "Seventy", "Eighty", "Ninety"}; 
	
	public static String convert(int n) {
		if(n < 0)
			return "Minus " + convert(-n); 
		
		if(n < 20)
			return units[n];
		
		if(n < 100)
			return tens[n/10] + (n%10 != 0 ? " " : "") + units[n%10];
		
		if(n < 1000)
			return units[n/100] + " Hundered" + (n%100 != 0 ? " " : "") + convert(n%100);
		
		if(n < 1000000)
			return convert(n/1000) + " Thousand" + (n%1000 != 0 ? " " : "") + convert(n%1000);
		
		if(n < 1000000000)
			return convert(n/1000000) + " Million" + (n%1000000 != 0 ? " " : "") + convert(n%1000000);
		
		return convert(n/1000000000) + " Billion" + convert(n%1000000000);
	}
	
	public static void main(String[] args) {
		int n = 1;
		System.out.println(n + " : " + convert(n));

		n = 21;
		System.out.println(n + " : " + convert(n));
		
		n = 105;
		System.out.println(n + " : " + convert(n));
		
		n = 56945781;
		System.out.println(n + " : " + convert(n));
		
	}
}
