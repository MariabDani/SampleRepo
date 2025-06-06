package exceptionhandling;

public class CustomException2 {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		int age=16;
		if(age>18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			//System.out.println("not eligible to vote");
			throw new AgeException("Age under 18");
		}
	}

}
