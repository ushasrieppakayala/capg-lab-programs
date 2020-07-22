
public class Calculator {
	public static int calculate(int a, int b, MathOperation op)
	{
		return op.Operate(a, b);
	}
	public static void main(String[] args) {
	
	   int result=calculate(5, 6,(x,y)->x+y*x+y);
		System.out.println(result);
	}

	

}
