import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
   Scanner in = new Scanner (System.in);
		
		Bank  b1 = new Bank (5);
		Bank  b2 = new Bank (2) ;
		
	
		b2.addClient("Mike" , 1000);
		b2.addClient("Joe" , 3000);
		
	
	
	int x ;
	
	
	
	
	
	String  nameClient ;
	double balanceClient ;
	boolean Client ; 
	
	String  nameClose;
	boolean Close ;
	
	String  nameDeposit ;
	double balanceDeposit;
	boolean Deposit ; 
	
	String  nameWithdraw ;
	double balanceWithdraw;
	boolean Withdraw ; 
	
	
	String  nameTransfer1;
	String  nameTransfer2 ;
	double balanceTransfer;
	boolean Transfer ; 
	
	String  nameTransferToBank1;
	String  nameTransferToBank2 ;
	double balanceTransferToBank;
	boolean TransferToBank ; 
	
	String  nameDisplay;
	
	
	String namerichest;
	
		do {
			System.out.println(" ******************************");
			System.out.println(" * 1- Add Client.              *") ; 
			System.out.println(" * 2- Close a client account.  *");
			System.out.println(" * 3- Deposit.                 *") ;  
			System.out.println(" * 4- Withdraw.                *");
			System.out.println(" * 5- Transfer.                *" ); 
			System.out.println(" * 6- Transfer to another bank.*" );
			System.out.println(" * 7- Display balance.         *");
			System.out.println(" * 8- Find the richest client. *" );
			System.out.println(" * 9- Exit.                    *");
			System.out.println(" ******************************");

	        System.out.print(" => ");
			 x = in.nextInt();
			
			
			if (x == 1) {
				
         System.out.print("Enter name and balance: ");
           nameClient  = in.next();	
			balanceClient = in.nextDouble();	
				
			Client = b1.addClient(nameClient, balanceClient) ;
			
			if (Client == false) {
				
				System.out.println("ERROR");
				
			}
			
			else {
		
				System.out.println("DONE");
				
			}
			
		
				
			}
			
			
			if (x == 2) {
				
				System.out.print("Enter name:");
				nameClose = in.next();
				Close = b1.deleteClient(nameClose) ;
				
				if (Close == false) {
					
					System.out.println("ERROR");
				}
				else {
					System.out.println("DONE");
					
				}
			}
			
			
			
			if (x == 3) {
				
		         System.out.print("Enter name and amount: ");
		         nameDeposit  = in.next();	
				balanceDeposit = in.nextDouble();	
					
				Deposit = b1.deposit(nameDeposit, balanceDeposit) ;
		         
	          if (Deposit == false) {
				
				System.out.println("ERROR");
				
			}
	          else {
	      		
					System.out.println("DONE");
					
				}
						
					}
					
			
			if (x == 4) {
				
		         System.out.print("Enter name and amount: ");
		         nameWithdraw  = in.next();	
				balanceWithdraw = in.nextDouble();	
					
				Withdraw  = b1.withdraw(nameWithdraw, balanceWithdraw) ;
		         
	          if (Withdraw  == false) {
				
				System.out.println("ERROR");
				
			}
	          else {
	      		
					System.out.println("DONE");
					
				}
						
					}
					
			if (x == 5) {
				
		         System.out.print("Enter from name, to name, and amount:  ");
		         nameTransfer1  = in.next();
		         nameTransfer2 = in.next();
				balanceTransfer = in.nextDouble();	
					
				Transfer = b1.transfer(nameTransfer1, nameTransfer2, balanceTransfer);
		         
	          if (Transfer == false) {
				
				System.out.println("ERROR");
				
			}
	          else {
	      		
					System.out.println("DONE");
					
				}
						
					}
					
			
			if (x == 6) {
				System.out.print("Enter from name (this bank), to name (other bank), and amount:");
				nameTransferToBank1 = in.next();
				nameTransferToBank2 = in.next();
                balanceTransferToBank = in.nextDouble();
				
                TransferToBank = b1.transferToBank(nameTransferToBank1, b2 , nameTransferToBank2 , balanceTransferToBank) ;
        
				   if (TransferToBank == false) {
						
						System.out.println("ERROR");
						
					}
			          else {
			      		
							System.out.println("DONE");
							
						}
				
			}
					
				   
				   
					if (x == 7) {
						System.out.print("Enter name:");
						nameDisplay = in.next();
						 b1.display(nameDisplay);
						 
						 
				
					}
			
			
			
					if (x == 8) {
						namerichest = b1.findMax() ;
						 
						
						if (namerichest == null) {
							
							System.out.println("No clients");
							
						}
						
						else {
							
							System.out.println(namerichest);
							
						}
						
				
					}
			
					
					
					if (x >= 10 || x <= 0 ) {
						
						System.out.println("Invalid");
					}
					
			
	
		}while (x != 9 );
	System.out.println("Goodbye");
		
	in.close();
		
	}

}
