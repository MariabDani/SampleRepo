package inheritance;
import accessmodifiers.Access1;

public class Access4 extends Access1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access4 obj= new Access4();
		obj.display1();
		obj.display3(); // protected method is accessible here because we created the subclass
	}					//display3 is not accessibl in Access3 because the subclass is not created
	

}
