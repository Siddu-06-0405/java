
public class Box {
	double width;
	double height;
	double depth;
	
	Box(double w,double h,double d){
		this.width = w;
		this.height = h;
		this.depth = d;
	}
	double volume() {
		return height*width*depth;
	}
	
	void dimension(double w,double h,double d) {
		width = w;
		height = h;
		depth = d;
	}
}
