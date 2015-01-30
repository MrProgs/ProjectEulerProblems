public class EvenFibs{

	public static void main(String args[]){
	
		System.out.println(computeEvenFibs(4000000));
	
	}
	
	
	public static int computeEvenFibs(int cap){
	
		int prev = 1;
		int current = 2;
		int sum = 0;
		while (current < cap){
			if(current % 2 == 0){
				sum += current;
			}
			int temp = current;
			current = current + prev; 
			prev = temp;
		}
	
		return sum;
	}


}