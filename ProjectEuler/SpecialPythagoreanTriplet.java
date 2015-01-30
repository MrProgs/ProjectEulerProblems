public class SpecialPythagoreanTriplet{

	public static void main(String args[]){
	
		System.out.println(pythagTrip(1000));
	
	}
	
	
	public static long pythagTrip(int num){
        for (int a = 1; a < num/3; a++){		//because a < b
            for (int b = a + 1; b < num/2; b++){	//because b />=500
                int c = num - a - b;
                if (a * a + b * b == c * c)
                    return a * b * c; //ans = 31875000 
            }
        }
        return -1;
    }
}