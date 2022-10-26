
public class ThrowableException {
		public static void main(String[] args) {
			BankApplication checking=new BankApplication();
			checking.deposit(2000);
				checking.withdraw(-1000);

			System.out.println(checking.getbalance());
		}
		}
	

