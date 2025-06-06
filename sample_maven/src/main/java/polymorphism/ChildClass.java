package polymorphism;

public class ChildClass extends ParentClass{

	public void display()
	{
		System.out.println("Child class Method");
		super.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
		obj.display();
		
	}

}
