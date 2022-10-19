//This program tells if a number is a prime number or not
public class PrimeNumber {
    public static void main(String[] args) {	
		
        int number = 8;
		boolean isPrime = true;
        
		for(int i = 2; i < number/2; i++) {
			if(number % i == 0)	{ //if number is divisible by i then its not a prime number
				isPrime = false;
			}
		}

		if(isPrime == true) {
            System.out.println("The number is a prime number");
		}
		else {
            System.out.println("The number is not a prime number");
		}
	}
}
