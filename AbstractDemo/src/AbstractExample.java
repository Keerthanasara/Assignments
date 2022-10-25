abstract class ShoppingCart{
	abstract void billing();
	void show() {
		System.out.println("method inside abstract class");
	}
}
class seller extends ShoppingCart{
	void billing(){
		System.out.println("total amount is in the bill");
	}
	
}
public class AbstractExample {
public static void main(String[] args) {
	seller obj=new seller();
	obj.billing();
	obj.show();
	
}
}
