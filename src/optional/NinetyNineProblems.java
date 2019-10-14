package optional;

/* Use the Extract Constant refactoring to remove the magic number. */

public class NinetyNineProblems {
	public static void main(String[] args) {
		String lyrics = "If you're having girl problems I feel bad for you, son. I got " + 99 + " problems but ugly code ain't one.";
		System.out.println(lyrics);
	}
}
