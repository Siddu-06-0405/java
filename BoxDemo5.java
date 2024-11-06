
public class BoxDemo5 {

	public static void main(String[] args) {
		Box mybox1 = new Box(2,3,4);
		Box mybox2 = new Box(3,4,5);
		
		double vol;
		
		mybox1.dimension(10, 20, 30);
		mybox2.dimension(3,6,9);
		
		vol = mybox1.volume();
		System.out.println("Volume of box1 is "+vol);
		vol = mybox2.volume();
		System.out.println("Volume of box2 is "+vol);
	}

}
