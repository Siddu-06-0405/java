public class SquareRoot {
	
	static int sqr(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Negative numbers do not have real square roots.");
		}

		int d = 0;
		while (d * d <= n) {
			d++;
		}
		return d - 1; // d is incremented one extra time in the loop
	}

	public static void main(String[] args) {
		// Square Root without using inbuilt function
		int b = 5;
		int g = sqr(b);
		System.out.println("The integer square root of " + b + " is: " + g);
	}
}
