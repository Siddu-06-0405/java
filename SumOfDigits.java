
public class SumOfDigits {

	public static int S(int n) {
		// TODO Auto-generated constructor stub
		int rem,term = n ,f=0;
		int a[] = new int[10];
		int sum =0;
		while(term != 0) {
			rem = term%10;
			term = term/10;
			a[f] = rem;
			f++;
		}
		for(int i=0;i<f;i++) {
			sum = sum + a[i];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SumOfDigits sum = new SumOfDigits(231);
//		System.out.println(sum);
		int b = 234;
		System.out.println(SumOfDigits.S(b));
	}

}
