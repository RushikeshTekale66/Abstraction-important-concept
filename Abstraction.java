class Abstraction{
	public static void main(String [] args){
		Shape s = new ShapeImplementation("Shape", "Red");
		System.out.println(s.areaSquare(10));
		System.out.println(s.areaReactangle(10, 5));
		s.display();
	}
}


abstract class Shape{
	String name;
	String color;
	
	public Shape(String name, String color){
		this.name = name;
		this.color = color;
	}

	public abstract int areaSquare(int side);
	public abstract int areaReactangle(int base, int height);

	public void display(){
		System.out.println(this.name);
		System.out.println(this.color);
	}
}

class ShapeImplementation extends Shape{

	public ShapeImplementation(String name, String color){
		super(name, color);
	}
	
	public int areaSquare(int s){
		int area = s*s;
		return area;
	}
	public int areaReactangle(int b, int h){
		int area = b*h;
		return area;
	}
}