package StringSet;

public class StringCompare {
	public static void main(String[] args) {
		String str1 ="a123";
		String str2 = new String(str1);
		String str3 ="a123";
		String str4 ="A123";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str4));
		System.out.println(str1.equalsIgnoreCase(str4));

		System.out.println(str1.startsWith("a"));
		System.out.println(str1.endsWith("2"));
		
	}
}
	