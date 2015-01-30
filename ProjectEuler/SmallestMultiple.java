public class SmallestMultiple{

	public static void main(String args[]){
	
		System.out.println(smallestMult(20));
	
	}
	
	/* Determines the smallest int that is evenly divisible by all the numbers
	** in the range 1 - N*/
	public static int smallestMult(int N){
	
		boolean notFound = true;
		int currentNum = N;
		while(notFound){
			for(int i = 1; i <= N; i++){
				if(currentNum % i == 0)	notFound = false;
				else{
					notFound = true;
					break;
				}
			}
			if(notFound) currentNum++;
			else break;
		}
		
		return currentNum;
	
	}

}