package exceptionhandling;

public class CustomExceptions {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		int age=16;
		if(age>18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			//System.out.println("not eligible to vote");
			throw new VotingException("Age under 18");
		}
	}

}
