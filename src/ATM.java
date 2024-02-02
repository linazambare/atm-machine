import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int withdraw, balance = 100000;
        System.out.println("                     Welcome to Lina's ATM Machine");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        
        int attempts = 3; // Number of attempts allowed
        while (attempts > 0) {
            System.out.println("Enter your PIN"); // pin
            int PIN = sc.nextInt();
            
            if (PIN == 101) {
                System.out.println("PIN is correct");
                break; // Exit the loop if PIN is correct
            } else {
                attempts--;
                System.out.println("Incorrect PIN. You have " + attempts + " attempts left.");
                
                if (attempts == 0) {
                    System.out.println("Maximum attempts reached. Exiting...");
                    System.exit(0);
                }
            }
        }
        
        int n = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println("             ");
            System.out.println("          1. Cash Withdraw 2. Cash Deposit");
            System.out.println("             ");
            System.out.println("             ");
            System.out.println("          3. Mini Statement 4. Balance Inquiry");

            System.out.println("             ");
            System.out.println("Enter choice");
            int choice = sc.nextInt();
            switch (choice) {case 1:
            	System.out.println("Enter amount forwithdraw"); // Withdraw
            	withdraw = sc.nextInt();
            	if (balance >= withdraw) {
            	 balance=balance- withdraw;

            	 System.out.println("Collect your cash ="+withdraw);
            	} else {
            		System.out.println("Insufficent Balance");
            	}
            	break;
            	case 2:
            	System.out.println("Enter amount for deposite"); // Deposite
            	int Deposit = sc.nextInt();
            	balance=balance + Deposit;
            	System.out.println(Deposit +" is deposit to your account");
            	System.out.println("  THANK YOU......");
            	System.out.println("  Visit Again");
            	break;
            	case 3:
            		
            	System.out.println(" mini Statement"); //mini statement

            	System.out.println("Name=LINA____XXXXX");
            	System.out.println("Mobile no=XXXXXXXX");
            	System.out.println("Email=XXXXXXX@gmail.com");
            	System.out.println("Balance" + balance);
            	System.out.println("  THANK YOU......");
            	System.out.println("  Visit Again");
            	case 4:
            	System.out.println("Total balance =" +balance); // balance }
            	System.out.println("  THANK YOU......");
            	System.out.println("  Visit Again");
            	}
            	}
            
        
        sc.close(); // Close the Scanner when done
    }
}

