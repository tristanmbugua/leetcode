package waterBottles;

public class WaterBottles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numWaterBottles(9, 3));
	}
	public static int numWaterBottles(int numBottles, int numExchange) {
        int sum = 0;
        int remainder = 0;
		while (numBottles > 0) {
			//Drink
	        sum += numBottles;
	        
	        //Manage empty bottles
	        numBottles += remainder;
	        
	        //Manage leftover bottles
	        remainder = numBottles % numExchange;
	        
	        //Convert to water
	        numBottles /= numExchange;
	        
		}
		
        return sum;
    }
}