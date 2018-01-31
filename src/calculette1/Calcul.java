package calculette1;

public class Calcul {

	private int X;
	private int Y;
	private int add;
	private int sous;
	private int mult;
	private int div;
	
	public int add(int X, int Y) {
		this.X = X;
		this.Y = Y;
		this.add = X+Y;
	}
	
	public int sous(int X, int Y) {
		this.X = X;
		this.Y = Y;
		this.sous = X-Y;
	}
	
	public int mult(int X, int Y) {
		this.X = X;
		this.Y = Y;
		this.mult = X*Y;
	}
	
	public int div(int X, int Y) {
		this.X = X;
		this.Y = Y;
		this.div = X/Y;
	}
	
	public void Print() {
		System.out.println("	addition : " + this.add);
	}
	
}
