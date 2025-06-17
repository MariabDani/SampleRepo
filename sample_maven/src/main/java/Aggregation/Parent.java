package Aggregation;

public class Parent {

	String name;
	int roll;
	public Parent(String name, int roll)
	{
		this.name= name;
		this.roll=roll;
	}
	public void display()
	{
		System.out.println(name+roll);
	}
}
