package checkArrayFormationThroughConcatenation;

import java.util.Arrays;
import java.util.HashMap;

public class CheckArrayFormationThroughConcatenation {
    public static void main(String[] args) {
        System.out.println(canFormArrayHashMap(
                new int[]{91, 4, 64, 78},
                new int[][]{{78}, {4, 64}, {91}}
        ));
    }

    public static boolean canFormArrayHashMap(int[] arr, int[][] pieces) {
        /**Hashmap Implementation*/
        //Create a hash-map with integer keys and integer array values.
        HashMap<Integer, int[]> map = new HashMap<Integer, int[]>();

        //This will represent the current value being iterated over in the parent array.
        int curr = 0;

        //Sort both lists.
        Arrays.sort(arr);
        Arrays.sort(pieces, (a, b) -> Integer.compare(a[0], b[0]));

        //Iterate over each list and store the subarray as the value with
        //the leading value as the key.
        for (int i = 0; i < pieces.length; i++) {
            map.put(pieces[i][0], pieces[i]);
        }

        int j = 0;

        int[] currentArr;
        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i].length > 1) {
                currentArr = map.get(pieces[i][0]);
                for (int k = 0; k < map.get(pieces[i][0]).length; k++) {
                    if (currentArr[k] != arr[j]) {
                        return false;
                    }

                    j++;
                }
                continue;
            }

            if (pieces[i][0] != arr[j]) {
                return false;
            }

            j++;
        }


        return true;
    }
//    public static boolean canFormArrayB_Search(int[] arr, int[][] pieces) {
//        //
//    }
}
