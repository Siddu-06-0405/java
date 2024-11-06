
public class fib {

	static int fibn(int n)
	{
		if(n == 1) {
			return 0;
		}
		if(n == 2)
		{
			return 1;
		}
		
		return fibn(n-1)+fibn(n-2);
	}
	
	public fib() {
		// TODO Auto-generated constructor stub
		int b = 4;
		int x = fibn(b);
		System.out.println(x);
	}

}
