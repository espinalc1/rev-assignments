package VariousStrings;

public class VinayStringBufferDemo {
	public static void showResults() {
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		System.out.println("memory address before modifying : " + System.identityHashCode(sb));
		sb.append(" hey").append(true).append('d').append(1111).append(12.33);
		System.out.println(sb);

		System.out.println("memory address after modifying : " + System.identityHashCode(sb));

		sb.insert(1, "JAVA");
		System.out.println(sb);

		sb.delete(1, 3);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

		System.out.println("\n");
		StringBuffer sb1 = new StringBuffer("raj");
		StringBuffer sb2 = new StringBuffer("raj");
		System.out.println("Using the primitive equality boolean operator = " + (sb1 == sb2));
		System.out.println("Using the object equality boolean method = " + (sb1.equals(sb2)));

		if (sb1.toString().equals(sb2.toString())) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}

	}
}
