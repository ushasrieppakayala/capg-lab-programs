
public interface MathOperation {
    //int Operate();
	int Operate(int x, int y);
    default void Demo1()
    {
    	System.out.println("default method");
    }
    static void Demo2()
    {
    	System.out.println("static method");
    }
}
