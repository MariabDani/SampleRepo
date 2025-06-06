package superkeyword;

public class childClass extends Parentclass {
	public childClass()
	{
		super(5,10);
		System.out.println("hi, child class constructor");
	}
	 String word="Hi";
	 public void show()
	 {
		 System.out.println(super.word);
		 System.out.println(this.word);
	 }
	 
	 public void Display()
		{
			System.out.println("child class method");
			super.Display();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 childClass obj= new childClass();
 //obj.show();
 //obj.Display();
 
	}

}
