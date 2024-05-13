package kthSmalletPrimeFraction;

import java.util.*;

public class KthSmalletPrimeFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,3,5,29,53,79,83,97};
		System.out.println(kthSmallestPrimeFraction(nums, 24));
		
		
	}
	
	public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int[] fraction = {-1, -1};
		double decimal = 0;
        PriorityQueue<Double> queue = new PriorityQueue<Double>();
		
		//Add all data into the heap.
		for (int i = arr.length-1; i > -1; i--) {
			for (int j = 0; j < arr.length; j++) {
				if ((double)arr[i]/(double)arr[j] < 1) {
					double val = (double)arr[i]/(double)arr[j];
					queue.add(val);
				}
			}
		}
		
		//Pull smallest value.
		while (k > 1) {
			queue.remove();
			k--;
		}
		decimal = queue.remove();
		
		
		//Convert to fraction
		for (int i = 0; i < arr.length; i++) {
			double val = decimal * arr[i] % 1.0;
			
			//Five points of confidence, decimals are not perfect.
			if (decimal * arr[i] % 1.0 > 0.99999 || decimal * arr[i] % 1.0 < 0.00001) {
				fraction[0] = (int)(Math.round(decimal*arr[i]));
				fraction[1] = arr[i];
			}
		}
		
		return fraction;
    }
}