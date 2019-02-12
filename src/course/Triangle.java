package course;

public class Triangle {
	
	public double sizeA;
	public double sizeB;
	public double sizeC;
	
	public double getSizeA() {
		return sizeA;
	}
	public void setSizeA(double sizeA) {
		this.sizeA = sizeA;
	}
	public double getSizeB() {
		return sizeB;
	}
	public void setSizeB(double sizeB) {
		this.sizeB = sizeB;
	}
	public double getSizeC() {
		return sizeC;
	}
	public void setSizeC(double sizeC) {
		this.sizeC = sizeC;
	}
	
	public double area() {
		double p = (sizeA + sizeB + sizeC)/2;
		return Math.sqrt(p*(p-sizeA)*(p-sizeB)*(p-sizeC));
	}
	public Triangle(double sizeA, double sizeB, double sizeC) {
		super();
		this.sizeA = sizeA;
		this.sizeB = sizeB;
		this.sizeC = sizeC;
	}
	
	
}
