package inheritance;

public class singleinheritance_Childclass extends Single_Inheritance {

	public void show()
	{
		System.out.println("Hi , I am from child class");
	}
	public static void print()
	{
		System.out.println("I am the static method pf child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		singleinheritance_Childclass ob= new singleinheritance_Childclass();
		ob.show();
		ob.display();
		print();
		Single_Inheritance.print();
	}

}

