package demo.sl;

public class MyClass {
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	public static void main(String[] args) {		
		MyClass ob = new MyClass();
		System.out.println("Sum is : "+ob.sum(4, 2));
		System.out.println("Difference is : "+ob.sub(4, 2));
		System.out.println("Multiply is : "+ob.mul(4, 2));
		System.out.println("Division is : "+ob.div(4, 2));
	}
}
