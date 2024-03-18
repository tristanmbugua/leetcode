package insertInterval;

import java.util.*;

public class InsertInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static int[][] insertInterval(int[][] intervals, int[] newInterval) {
		
		int newIntervalStart = 0;
		int newIntervalEnd = 0;
		HashMap<Integer, Integer> list = new HashMap<Integer,Integer>();
		int[][] returnArray = intervals;
		for (int i = 0; i < intervals.length; i++) {
			list.put(intervals[i][0], intervals[i][1]);
		}
		
		int currentStartVal;
		int nextStartVal;
		
		int currentEndVal;
		int nextEndVal;
		
		//Find suitable start
		for (int i = 0; i < list.size(); i++) {
			//Find suitable start value. 
			currentStartVal = list.get(intervals[i][0]);
			nextStartVal = list.get(intervals[i+1][0]);
			currentEndVal = list.get(intervals[i][1]);
			nextEndVal = list.get(intervals[i+1][1]);
			if (
					newInterval[0] >= currentStartVal &&
					newInterval[0] <= currentEndVal) {
				newIntervalStart = currentStartVal;
			}
			
			if (
					newInterval[1] >= nextStartVal &&
					newInterval[1] <= nextEndVal) {
				newIntervalStart = currentStartVal;
			}
			
			
			if (
					list.get(i).intValue() < newInterval[0] &&
					list.get(i).intValue() > newInterval[0]) {
				newIntervalStart = list.get(i).intValue(); 
			}
			//			hashMap.put(intervals[i][0], intervals[i][1]);
		}
		
		return returnArray;
	}

}
