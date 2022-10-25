abstract class shape{
	abstract void draw();
}
class line extends shape{
	void draw() {
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		
	}
	
}
class rectangle extends shape{
	void draw() {
		System.out.print("-");
		System.out.print("  -");
		System.out.print("    -");
		System.out.print("      -");
		System.out.println("        |");
		System.out.println("        |");
		System.out.println("        |");
		System.out.print("       -");
		System.out.print("      -");
		System.out.print("  -");
		System.out.print(" -");
		System.out.print("|");
		System.out.println("|");
		System.out.println("|");
	}
	
}
class cube extends shape{
	void draw() {
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.print("-");
		System.out.print("  -");
		System.out.print("    -");
		System.out.print("       |");
		System.out.println("       |");
		System.out.println("       |");
	}
	
}
public class AbstractShapes {
public static void main(String[] args) {
	line obj=new line();
	obj.draw();
	rectangle shape=new rectangle();
	shape.draw();
cube shapes=new cube();
shape.draw();
	
}
}
