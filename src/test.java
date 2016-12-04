import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		ArrayList<BankAccount> BankAccountList = new ArrayList<BankAccount>();
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		boolean isEntry = true;

		while (isEntry) {
			System.out.println("Please enter the name to whom the account belongs (exit to abort): ");
			String input = scanner1.next();

			if (input.equals("exit")) {
				isEntry = false;
				break;
			}
			
			
			
			System.out.println("What number would you like to enter? : ");
			
			
			try{
			BankAccountList.add(new BankAccount(scanner2.nextDouble(), input));
			}
			catch(InputMismatchException e){
				System.out.println("Error with Input");
				isEntry = false;
				break;
			}
			
			

			if (BankAccountList.size() == 4) {
				double highestBalance = 0;
				String name = "";
				for (int i = 0; i < 4; i++) {
					if (BankAccountList.get(i).getBalance() > highestBalance) {
						highestBalance = BankAccountList.get(i).getBalance();
						name = BankAccountList.get(i).getName();
					}
				}
				
				
				
				System.out.println("The person with the largest balance is: " + name);
				System.out.println("The amount is $" + highestBalance);
			}
		} // While ends here
		scanner1.close();
		scanner2.close();
	}

}
