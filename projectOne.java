package projectOne;
/*
 * Calculates even, odd and prime number.
 * @author Ang
 */
import java.util.Scanner;

public class projectOne {
	
	public static boolean isodd(int odd) {
		for (int i = 0; i<odd;i++) {
			if(odd%2 != 0 ) {
				return true;
			}
		  }
				return false;
		}
	
	public static boolean iseven(int even) {
		for (int j = 0; j<even; j++) {
			if (even%2 == 0) {
				return true;
		    }
		  }
				return false;	
		}
	
	public static boolean isprime(int prime) {
		for (int k = 2; k<=prime/2; k++) {
			if (prime % k == 0) {
				return false;
			}
		  }
				return true;
	   }
	
	public static void main(String[] args) {
		
		int no;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----WELCOME-----");
		System.out.println("Please enter any number > 0:");
		no = sc.nextInt();
		
		while(no > 0) {
		System.out.println("===========================");
		System.out.println("Choose from the following:");
		System.out.println("1. Displays odd number up to " +no+".");
		System.out.println("2. Displays even number up to " +no+".");
		System.out.println("3. Displays prime number up to " +no+".");
		System.out.println("4. Exit");
		System.out.println("===========================");
		
		int choose = sc.nextInt();
		
		switch(choose){
		
		case 1:
			System.out.println("*************************");
			System.out.println("Odd number list:");
			for (int odd = 0;odd<=no;odd++) {
			if (isodd(odd)) {	
		    	System.out.println(odd);
		    	
			   }
			}
			System.out.println("**************************");
			break;
			
		case 2:
			System.out.println("**************************");
			System.out.println("Even number list:");
			for (int even = 0;even<=no;even++) {
				if (iseven(even)) {
				System.out.println(even);
			   }
			}
			System.out.println("**************************");
			break;
			
		case 3:
			System.out.println("*****************************");
			System.out.println("Prime number list:");
			for (int prime = 2;prime<=no;prime++) {
				if (isprime(prime)) {
				System.out.println(prime);
				
			   }
			}
			System.out.println("********************************");
			break;
			
					
		case 4:	
			System.out.println("Thank you, have a nice day.");
			System.exit(0);
			
		default:
				break;
		}
	   }
	  }
	}


