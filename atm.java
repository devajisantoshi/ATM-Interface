package atminterface;
import java.util.Scanner;
public class atm
{
	 
		public static void main(String[] args) 
		{
			
       		System.out.println("Welcome to the ATM");
       		Scanner acc = new Scanner (System.in);
       		System.out.println("Enter yor Account number: ");
       		long account =acc.nextLong();
       		System.out.println("Enter your PIN: ");
    		Scanner keyboard = new Scanner(System.in);
    		int entry =keyboard.nextInt();
    		int pin = entry;
    		while ( entry != pin )
    		{
    			System.out.println("\nIncorrect PIN. Try again");
    			System.out.print("Enter your PIN: ");
    			entry = keyboard.nextInt();
    		}
    		System.out.println("\nPIN accepted. You now have access to your account.");
       	    int balance = 10000, withdraw, deposit;  
            Scanner sc = new Scanner(System.in);  
            while(true)  
            {  
             System.out.println("ATM Machine\n");  
             System.out.println("Choose 1 for Withdraw");  
             System.out.println("Choose 2 for deposit");
             System.out.println("Choose 3 for Check Balance");  
             System.out.println("Choose 4 for EXIT\n");  
             System.out.print("Choose the operation:");   
             int choice = sc.nextInt();  
             switch(choice)  
             {  
                 case 1:  
                    System.out.print("Enter money to be withdrawn:");   
                    withdraw = sc.nextInt();  
                    
                    if(balance >= withdraw)  
                    {
                    	balance = balance - withdraw;  
                    	System.out.println("Please collect your money");  
                    }  
                     else  
                    	  {     
                    	 	System.out.println("Insufficient Balance");  
                    	  }  
                    		System.out.println("");  
                    		break;
                 case 2:
                	 System.out.println("enter money to be deposited:");
                	 deposit=sc.nextInt();
                	 balance = balance + deposit;
                	 System.out.println("your money has been successfully deposited");
                	 System.out.println("");
                	 break;                	 
                 case 3:
                	 System.out.println("Balance : "+balance);  
                	 System.out.println("");  
                	 break;  
                 case 4:   
                	 System.out.println("Thank you for visiting");  
                	 System.exit(0);
             } 
         }     
			         
	}

}

