package encapsulation;

public class ChildClass {//extends can't be used because else it won't provide data hiding

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ParentClass obj= new ParentClass();
			obj.setter("Leanne", 2);
			obj.getter();
	}

}
