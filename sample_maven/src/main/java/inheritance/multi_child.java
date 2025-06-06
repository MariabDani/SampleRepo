package inheritance;

public class multi_child extends multi_pa{
	public void display()
	{
		System.out.println("Hi , I from child class");
	}

	public static void main(String[] args) {
		multi_child obj= new multi_child();
		obj.display();
		obj.displayparent();
		obj.displaygrand();
		// TODO Auto-generated method stub

	}

}
