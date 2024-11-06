
public class Box1 {
	double w,h,b;
	Box1(double wd,double ht,double br){
		w=wd;h=ht;b=br;
	}
	static double volume(ColourBox1 b ) {
		return b.w*b.h*b.b;
	}
}
