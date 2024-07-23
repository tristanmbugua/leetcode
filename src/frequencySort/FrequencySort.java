package frequencySort;

import java.util.*;

public class FrequencySort {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3};
        frequencySort(nums);
    }

    public static int[] frequencySort(int[] nums) {

        //Make a HashMap with the occurences.
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();


        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        int[] returnArray = new int[nums.length];

        for (int i = returnArray.length; i > 0; i--) {

        }

        //Make a two dimensional array, with the first dimension being occurences.


        return returnArray;
    }
}
