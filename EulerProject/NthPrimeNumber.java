public class NthPrimeNumber{

	public static void main(String args[]){
	
		System.out.println(nthPrime(10001));
	
	}
	
	public static int nthPrime(int N){
		
		long numberOfPrimes = 0;
		int number = 1;
		int maxLimit = 10000000;
		boolean[] sieve = new boolean[maxLimit];
		
		for(int i = 2; i < maxLimit; i++){
			if(sieve[i] == true) continue;
			
			numberOfPrimes++;
			if(numberOfPrimes == N){
				number = i;
				break;
			}
			
			for(int j = i+i; j < maxLimit; j+=i){
				sieve[j] = true;
			}
		
		}
		
		return number;
	
	}

}