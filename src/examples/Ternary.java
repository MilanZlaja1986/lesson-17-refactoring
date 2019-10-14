package examples;

public class Ternary {
	public static void main(String[] args) {

		// ternary operator
		String oddOrEven = 5 % 2 == 0 ? "even" : "odd"; 
		System.out.println(oddOrEven);

		System.out.println(isCool("June"));
	}

	// condensed if statement
	static boolean isCool(String name) {
		return name.equalsIgnoreCase("June");
	}
}
