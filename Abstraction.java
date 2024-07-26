class Abstraction{
	public static void main(String [] args){
		MathOp m = new MathOpImplemented();
		System.out.println(m.addition(10, 30));
		System.out.println(m.substraction(50, 5));
		System.out.println(m.multiplication(10, 10));
	}
}

abstract class MathOp{
	public abstract float addition(int a, float b);
	abstract double substraction(int a, double b);
	protected abstract int multiplication(int a , int b);

	public void m1(){
		System.out.println("In concrete method");
	}
}

class MathOpImplemented extends MathOp{
	public float addition(int n, float m){
		float reusult = n+m;
		return reusult;
	}
	double substraction (int n, double m){
		double reusult = n-m;
		return reusult;
	}
	protected int multiplication(int n, int m){
		int reusult = m*n;
		return reusult;
	}
}	

