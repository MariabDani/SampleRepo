package abstraction;

public class AbstarctionChild extends AbstractionParent{
	
	public void display()
	{
		System.out.println("child class display");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstarctionChild obj= new AbstarctionChild();
		obj.display();
		obj.print();
		obj.show();
		AbstractionParent obj1= new AbstarctionChild();// reference creation
		obj1.show();
		//obj1.display();
		obj1.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("override method");
	}
	
	//public abstract void trial();
}
