public class Multiples{

	public static void main(String args[]){
	
		int result = computeMultiplesSum(3,5,1000);
		System.out.println(result);
	
	}
	
	public static int computeMultiplesSum(int a, int b, int cap){
	
		int sum = 0;
		for (int i = 0; i < cap; i++){
			if (i%3 == 0 || i%5 == 0){
				sum += i;
			}
		
		}
		return sum;
	}

}