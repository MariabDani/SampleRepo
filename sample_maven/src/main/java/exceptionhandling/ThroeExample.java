package exceptionhandling;

public class ThroeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=16;
		if(age>18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			System.out.println("not eligible to vote");
			throw new ArithmeticException("Age under 18");
		}
	}

}
