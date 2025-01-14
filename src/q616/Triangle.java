package q616;

public class Triangle {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	
	
	public void setCoordinate(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
	}
	
	
	public double balancex() {
		double dx;
		dx = (Math.round(((x1+x2+x3)/3.0)* 10))/10.0;
		return dx;
	}
	
	public double balancey() {
		double dy;
		dy = (Math.round(((y1+y2+y3)/3.0)* 10))/10.0;
		return dy;
	}
	
	public void printCenter() {
		System.out.println("(" + balancex() + ", " + balancey() + ")");
	}
}
