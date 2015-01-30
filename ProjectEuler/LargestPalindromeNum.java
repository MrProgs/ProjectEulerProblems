import java.lang.Integer;

public class LargestPalindromeNum{

	public static void main (String args[]){
	
		System.out.println(findLargestPalindrome(3));
	
	}
	
	/* This method will find the largest palindromeade by the product of two N-
	** digit numbers*/
	public static int findLargestPalindrome(int N){
	
		double start = Math.pow((double)10,(double)N-1);
		double end = Math.pow((double)10,(double)N) - 1;
		int palindrome = 0;
		int factorOne = 0;
		int factorTwo = 0;
		
		for(start = start; start <= end; start++){
			for(int j = (int)start; j <= end; j++){
				int temp = (int)start * j;
				if(isPalindrome(temp) == true && temp >= palindrome){
					palindrome = temp;
					factorOne = (int)start;
					factorTwo = j;
				}
			
			}
			
		} 
		
		return palindrome;
	
	}
	
	
	public static boolean isPalindrome(int num){
	
		String number = Integer.toString(num);
		int begin = 0;
		int end = number.length();
		
		boolean answer = false;
		
		while (begin <= end){
			if(number.charAt(begin) == number.charAt(end-1)){
				begin+=1;
				end-=1;
				answer = true;
			}
			else{
				answer = false;
				break;
			}
		}
		return answer;
		
	
	}

}