package minimumCostToHireKWorkers;

import java.util.*;

public class MinimumCostToHireKWorkers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] q = {10, 20, 5};
		int[] w = {70, 50, 30};
		mincostToHireWorkers(q, w, 2);
	}
	
	public static double mincostToHireWorkers(int[] quality, int[] wage, int k) {
		int leastAmount = 0;
		int current = 0;
		int ratio = 0;
		
		//HashMap with heap values stored.
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>(); 
		
		//Brute force
		//Add all combinations to a heap, pull lowest two.
		for (int i = 0; i < quality.length; i++) {
			for (int j = 0; j < wage.length; j++) {
				if (i != j) {
					ratio = quality[j]/quality[i];
					current = wage[j] * ratio;
					
				}
			}
		}
		
		return leastAmount;
    }
}