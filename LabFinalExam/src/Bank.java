
public class Bank {
	private String[] names;
	private double[] balances;
	private int nClients; 
	
	public Bank() {
		
	
		
	}
	
	public Bank(int size ) {
		names = new String[size];
		balances = new double [size];
		nClients = 0;
	}
	
	public int findIndexByName(String name ) {
		
		for (int i = 0 ; i < nClients ; i++ ) {
	
			if (names[i].equalsIgnoreCase(name))
		
			return i ;

		}
		
		return -1 ;
		
	}
	
	
	public  boolean addClient(String name , double balance ) {
		
		if (nClients >= names.length) {
			
			return false ;
			
		}
		
		
		
		if (findIndexByName(name) != -1) {
			
			return false ;
			
		}
		
		
		
		nClients +=1 ; 
		
		int i = nClients - 1 ;
		
		names[i] = name ;
		balances[i] = balance;
		
	return true ;
		
		
		
	}
	
	 public boolean deleteClient(String name) {
		 int x = findIndexByName(name) ;
		if (x == -1) {
			
			return false ;
			
		}
	
				
		if ( x == (names.length - 1 ) ) {
			
			names[x] = null ;
			balances[x] = 0 ;
		}
		
		else {
		names[x] = names[names.length - 1];
		balances[x] = balances[balances.length - 1] ;
		 names[names.length - 1] = null ;
		 balances[balances.length - 1]  = 0 ;
		}
		
		nClients--  ;
		
		return true ;
		
		
	
	}
	
	public boolean deposit(String name , double amount ) {
		int x = findIndexByName(name);
				
		if ( x == -1) {
			
			return false ;
			
		}
		
		

		double y = balances[x] + amount;
		
		System.out.println(names[x] + " was " + balances[x] + ", now " + y );
		
		 balances[x] =  balances[x] + amount ;
		
		return true ;
		

	}
	
	public boolean withdraw(String name , double amount) {
		
		int x = findIndexByName(name);
		
		if ( x == -1) {
			
			return false ;
			
		}
		
		double y = balances[x] - amount;
		
		if (y <= -1) {
			System.out.println(names[x] + " was " + balances[x] + ", now " +  balances[x]  );
			return false ;
		}
		
		System.out.println(names[x] + " was " + balances[x] + ", now " + y );
		
		 balances[x] =  balances[x] - amount;
		
		return true ;
		
	}
	
	
	public  boolean transfer(String fName , String tName , double amount ) {
      int x = findIndexByName(fName);
      int y = findIndexByName(tName);

		
		if ( x == -1 || y == -1) {

			return false ;
		}

		
double z1 =  balances[x] - amount ;
double z2 =  balances[y] + amount ;
if (z1 <= -1) {
	System.out.println(names[x] + " was " + balances[x] + ", now " + balances[x] );
	System.out.println(names[y] + " was " + balances[y] + ", now " +  balances[y]  );
	return false ;
}


System.out.println(names[x] + " was " + balances[x] + ", now " + z1 );
System.out.println(names[y] + " was " + balances[y] + ", now " + z2 );

balances[x] -= amount ;
balances[y] += amount ;

return true ;

		
	}
	
	public boolean transferToBank(String f , Bank toBank , String t, double a ) {
		
	    int x = findIndexByName(f);
	      int y = toBank.findIndexByName(t);

			
			if ( x == -1 || y == -1) {

				return false ;
			}

			
	double z1 =  balances[x] - a ;
	double z2 =  toBank.balances[y] + a ;
	if (z1 <= -1) {
		System.out.println(names[x] + " was " + balances[x] + ", now " + balances[x] );
		System.out.println(toBank.names[y] + " was " + toBank.balances[y] + ", now " + toBank.balances[y] );
		return false ;
	}
	
	
	System.out.println(names[x] + " was " + balances[x] + ", now " + z1 );
	System.out.println(toBank.names[y] + " was " + toBank.balances[y] + ", now " + z2 );
	
	balances[x] -= a ;
	toBank.balances[y] += a ;

	return true ;

		
		
		
		
	}
	
	
	
	
	public void display(String name ) {
		int x = findIndexByName(name) ;
		if (x == -1) {
			
			System.out.println("Not found.");
		}
		
		else {
			
			System.out.println(names[x] + " " + balances[x]+" SR");
		
		}
		
		
		
		
		
	}

	public String findMax() {
		
		if (nClients == 0 ) {
			
			return null ;
			
		}
		
		double x = 0 ;
		int y = 0 ;
		for (int i = 0 ; i < balances.length ; i++ ) {
			if (balances[i] > x ) {		
				x = balances[i];
			        y = i ;
			        
			        }
		}
		
		return names[y] + " " + balances[y]+" SR" ;
		
	}

	

}
