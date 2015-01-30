import java.util.Scanner;
import java.io.File;
import java.util.regex.Pattern;
import java.lang.Integer;
import java.io.FileNotFoundException;
import java.util.Arrays;
public class LargestProductInSeries{

	public static void main(String args[]) throws FileNotFoundException{
	
		Scanner series = new Scanner(new File("1000DigitNumber.txt"));
		System.out.println(largestProduct(series));
		series.close();
	
	}
	
	public static long largestProduct(Scanner series){
	
		long product = 1;
		int[] sequence = new int[13];
		int[] finalSequence = new int[13];
		Pattern number = Pattern.compile("\\d");
		for (int i = 0; i < 13; i++){
			sequence[i] = Integer.parseInt(series.findInLine(number));
			finalSequence[i] = sequence[i];
			product *= i;
		}
		
		int curPos = 0;
		
		while(series.hasNext()){
			long tempProduct = 1;
			sequence[curPos] = Integer.parseInt(series.findInLine(number));
			for(int val = 0; val < sequence.length; val++){
				tempProduct = tempProduct * sequence[val];
			}
			if (tempProduct >= product){
				product = tempProduct;
				finalSequence = sequence.clone();
			}
			if(curPos == 12) curPos = 0;
			else curPos++;
		}
		System.out.println(Arrays.toString(finalSequence));
		return product;
	
	}


}