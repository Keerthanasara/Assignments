abstract class persistance{
	abstract void persistence();

	
}
  class filepersistence extends persistance{

	void persistence() {
		System.out.println("add1");
		
		
	}
	

	

}
 class databasepersistence extends persistance{

	void persistence() {
		System.out.println("add2");
		
		
	}

}

public class AbstractEg {
public static void main(String args[]) {
	databasepersistence obj=new databasepersistence();
	obj.persistence();
	
}
}
