package maximizeHappinessOfSelectedChildren;

import java.util.*;

public class MaximizeHappinessOfSelectedChildren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {7, 50, 3};
		System.out.println(maximumHappinessSum(nums, 3));
		
	}

	public static long maximumHappinessSum(int[] happiness, int k) {
        long sum = 0;
        //Note the decrement each iteration so that you do not have to alter the array.
        long decrementValue = 0;
		//This is combinatorics.
        
        
        
        //First, sort the array. Read from back.
        Arrays.sort(happiness);
        
        long current = 0;
        
        //Why not just pick the highest value?
        for (int i = happiness.length-1; i > -1 && k > 0; i--) {
            //Conditional: Any value less than zero is set to zero;
        	current = happiness[i] + decrementValue; 
        	if (current > -1) {
        		sum += current;
        	}
        	
        	decrementValue--;
        	k--;
        }
        
        return sum;
    }
}
