public class SumSquareDifference{
	
	public static void main(String args[]){
	
		System.out.println(sumSquareDif(100));
	
	}
	
	public static int sumSquareDif(int N){
	
		int sumOfSquares = 0;
		int squareOfSum = 0;
		
		for(int i = 1; i<= N; i++){
			sumOfSquares += (int)Math.pow((double)i, 2);
			squareOfSum += i;
		}
		squareOfSum = (int)Math.pow((double)squareOfSum, 2);
		
		return squareOfSum - sumOfSquares;
	
	}

}