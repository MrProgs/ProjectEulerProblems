import java.util.Arrays;

public class SummationOfPrimes{

	private static final int NUM = 2000000;
	public static boolean[] numbers = new boolean[NUM];
	
	public static void main(String args[]){
		
		fillSieve();
		System.out.println(sumOfPrimes(NUM));
	
	}
	
	public static long sumOfPrimes(int N){
	
		int prime = 2;
		long sum = 0;
		while (prime < N){
			if(isPrime(prime))	sum += prime;		
			prime++;
		}
		return sum;
	}
	
	public static boolean isPrime(int prime){
		return numbers[prime];
	}
	
	public static void fillSieve(){
	
		Arrays.fill(numbers, true);
		numbers[0]=numbers[1]=false;
		for (int i=2;i<numbers.length;i++) {
        	if(numbers[i]) {
            	for (int j=2;i*j<numbers.length;j++) {
                	numbers[i*j]=false;
            	}
        	}	
    	}
	}
}