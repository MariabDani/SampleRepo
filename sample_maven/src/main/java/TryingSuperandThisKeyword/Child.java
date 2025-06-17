package TryingSuperandThisKeyword;

public class Child extends Parent{
	
	public Child()
	{
		super();
		System.out.println("child constructor");
		super.display(34);
		super.p=20;
		this.c=90;
	}
	public Child(int a)
	{
		this();
		//super(); should be first statement
		System.out.println(a);
		this.displayChild(20);
		super.p=10;
	}
	int c;
	public void displayChild(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj= new Child(2);
		obj.displayChild(10);
	}

}
