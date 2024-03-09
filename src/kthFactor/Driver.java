package kthFactor;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem:
 * <pre>
 * Problem Name: The kth Factor of n
 * Problem Difficulty: Medium.
 * </pre>
 * Solution Stats:
 * <pre>
 * Runtime: 6ms
 * Runtime Rank: Beats 5.03% of users with Java 
 * Memory: 40.32MB
 * Memory Rank: Beats 60.86% of users with Java
 * </pre>
 * @version Date: March 9th 2024
 * @author Tristan Mbugua
 */
public class Driver {

	public static void main(String[] args) {
		System.out.println(kthFactor(7,1));
	}
	
	public static int kthFactor(int n, int k) {
		List<Integer> factors = new ArrayList<Integer>();
		for (double i = 0; i <= (int)n; i++) {
			double exp = (double)n/i;
			if ((exp % 1) != (0.00)) {
				continue;
			}
			factors.add((int)i);
		}
		try {
			return factors.get(k-1);
		} catch (Exception e) {
			return -1;
		}

	}

}
