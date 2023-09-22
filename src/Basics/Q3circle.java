package Basics;

public class Q3circle {
	private double radius;
	public  Q3circle() {
		radius=0.0;
	}
public  Q3circle(double radius) {
		this.radius=radius;
	}
public double calculate() {           //Calculate the cicumference
	return 2*Math.PI*radius;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q3circle c= new Q3circle(5.0);
		Q3circle d= new Q3circle();
		System.out.println(c.calculate());
		System.out.println(d.calculate());
		

	}

}
