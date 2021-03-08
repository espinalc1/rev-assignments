
public class Validator {
	 public static void validate(String desc, String pattern, String str) {
		 if (str.matches(pattern)){
			 System.out.println("Your " + desc + " is validated!");
		 } else {
			 System.out.println("Your " + desc + " is not valid!");
		 }
		 
	 }
}
