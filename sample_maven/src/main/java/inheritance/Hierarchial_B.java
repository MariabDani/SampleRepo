package inheritance;

public class Hierarchial_B extends Hierarchial_A {
	public void display()
	{
	
			System.out.println("Hi , I from child class B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchial_B obj= new Hierarchial_B();
		obj.display();
		obj.print();

	}

}
