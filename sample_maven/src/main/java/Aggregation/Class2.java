package Aggregation;

public class Class2 {
	int age;
	Parent par;

	public Class2(int age, Parent par)
	{
		this.age=age;
		this.par=par;
	}
	public void display()
	{
		System.out.println(age+par.name+par.roll);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj1= new Parent("abc", 5);
		Class2 obj= new Class2(10,obj1);
		obj.display();
		obj1.display();

	}

}
