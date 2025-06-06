package exceptionhandling;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try
		{
		int c=a/b;
		System.out.println("c is : "+c );
		}
		catch(ArithmeticException e)
		{
			//write codes to handle the exception
			System.out.println("Division by 0 not possible");
			System.out.println(e);
		}
		finally
		{
			System.out.println("this is the finally block");
		}
	}

}
