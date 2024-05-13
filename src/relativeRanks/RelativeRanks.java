package relativeRanks;

import java.util.*;

public class RelativeRanks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5, 4, 3, 2, 1};
		System.out.println(findRelativeRanks(nums));

	}
	public static String[] findRelativeRanks(int[] score) {
        String[] ranks = new String[score.length];
        
        int[] original = score.clone();
        
        //Sort original
        Arrays.sort(score);
        
        //Note rank based using HashMap
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        
        //Sort the highest value should get gold
        for (int i = score.length-1; i > -1; i--) { 
        	if (i == score.length-1) {
        		map.put(score[i], "Gold Medal");
        	} else if (i == score.length - 2) {
        		map.put(score[i], "Silver Medal");
        	} else if (i == score.length - 3) {
        		map.put(score[i], "Bronze Medal");
        	} else {
        		map.put(score[i], String.valueOf(score.length - i));
        	}
        }
        
        for (int i = 0; i < ranks.length; i++) {
        	ranks[i] = map.get(original[i]);
        }
        
        return ranks;
    }
}
