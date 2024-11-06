
public class Zangetsu extends Yhwach {
	
	int b = 10;
	int c;
	public Zangetsu() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("Zangetsu's Constructor.");
	}
	public Zangetsu(int gd, int tensa) {
		super.b=gd;
		this.b=tensa;
		c = super.b;
	}
	void yareYare(String u) {
		super.main(null);
//		System.out.println(super.b + u);
//		System.out.println(super.a+" and Ichigo");
	}
	public static void main(String[] args) {
//		Zangetsu zangetsu = new Zangetsu();
		Zangetsu white = new Zangetsu(12,14);
//		zangetsu.yareYare(" INSTINCT");
//		System.out.println("super class b is  "+zangetsu.c+",subclass Zangetsu b is "+zangetsu.b+", their sum is "+(zangetsu.b+zangetsu.c));
//		System.out.println(white.b+white.c);
		white.yareYare(Y);
	}
}
