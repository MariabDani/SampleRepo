package inheritance;

public class Hierarchial_C extends Hierarchial_A {
	public void show()
	{
		System.out.println("Hi, I am from child class C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchial_C obj= new Hierarchial_C();
		obj.show();
		obj.print();

	}

}
