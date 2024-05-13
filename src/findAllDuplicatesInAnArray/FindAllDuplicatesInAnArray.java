package findAllDuplicatesInAnArray;

import java.util.*;

public class FindAllDuplicatesInAnArray {

	public static void main(String[] args) {
		int[] nums = {1, 1, 2};
		List<Integer> returnList = findDuplicates(nums);
		System.out.println(returnList);

	}
	
	public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> returnList = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        
        for (int i = 0; i < nums.length; i++) {
        	if (map.get(nums[i]) == null) {
        		map.put(nums[i], 1);
        	} else {
        		map.replace(nums[i], map.get(nums[i])+1);
        	}
        }
        
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
        	if (entry.getValue() > 1) {
        		returnList.add(entry.getKey());
        	}
        }
        
        return returnList;
    }

}
