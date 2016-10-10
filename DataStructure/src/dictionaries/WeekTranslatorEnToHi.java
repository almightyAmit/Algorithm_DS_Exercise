package dictionaries;

import java.util.HashMap;
import java.util.Map;

public class WeekTranslatorEnToHi {

	public static void main(String[] args) {
		// English to Hindi Dictionary.
		Map<String, String> EngToHin = new HashMap<String, String>();
		
		// Putting Data into Dictionary.
		EngToHin.put("Monday", "Somavaar");
		EngToHin.put("Tuesday", "Mangalvaar");
		EngToHin.put("Wednesday", "Budhvaar");
		EngToHin.put("Thrusday", "Gurucaar");
		EngToHin.put("Friday", "Shukravaar");
		EngToHin.put("Saturday", "Shanivaar");
		EngToHin.put("Sunday", "Ravivaar");
		EngToHin.put("Thank you", "Dhanyawaad");
	
		// Retrieving Data from Dictionary.
		System.out.println(EngToHin.get("Sunday"));
		System.out.println(EngToHin.get("Monday"));
		System.out.println(EngToHin.get("Tuesday"));
		System.out.println(EngToHin.get("Wednesday"));
		System.out.println(EngToHin.get("Thrusday"));
		System.out.println(EngToHin.get("Friday"));
		System.out.println(EngToHin.get("Saturday"));

		System.out.println();
		// Print out all the keys.
		System.out.println(EngToHin.keySet());
		
		System.out.println();
		// Print out all key-value pair.
		System.out.println(EngToHin.toString());
		
		System.out.println();
		// Print the size of dictionary.
		System.out.println(EngToHin.size());
		
		System.out.println();
		// Overwriting the value.
		EngToHin.replace("Thank you", "Shukriya");
		
		System.out.println();
		// Removing the Entry.
		EngToHin.remove("Thank you");
		System.out.println(EngToHin.toString());
		
	}
	
}
