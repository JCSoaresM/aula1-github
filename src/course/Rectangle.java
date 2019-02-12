package course;

public class Rectangle {

		public double width;
		public double height;
		
		public double area() {
			return this.width * this.height;
		}
		
		public double perimeter() {
			return this.width*2 + this.height*2;
		}
		
		public double diagonal() {
			return Math.sqrt(this.height*this.height + this.width * this.width);
		}
		
		public String toString() {
			return "Altura: " +
					String.format("%.2f", this.height) +
					", Largura: "
					+String.format("%.2f", this.width) +
					", AREA: "+
					String.format("%.2f",area()) +
					", PERIMETER: "+
					String.format("%.2f",perimeter()) +
					", diagonal: "+
					String.format("%.2f",diagonal());
					
		}
}
