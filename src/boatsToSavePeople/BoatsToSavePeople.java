package boatsToSavePeople;

import java.util.*;

public class BoatsToSavePeople {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,1,4,2};
		System.out.println(numRescueBoats(nums, 6));
		
	}
	
	
	public static int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        
    	//Sort the list.
        Arrays.sort(people);
        
        for (int i = 0; i < people.length-1; i++) {
        	if (people[i] == limit) {
        		boats++;
        	} else {
        		if (people[i] + people[i+1] <= limit) {
        			people[i+1] = people[i] + people[i+1]; 
        		} else if (people[i] < limit) {
        			boats++;
        		}
        	}
        }
        
        return boats;
    }
}