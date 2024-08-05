package kthDistinctInAnArray;

import java.util.*;

public class KthDistinctInAnArray {

    public static void main(String[] args) {
        System.out.println(
                kthDistinct(
                        new String[]{"d","b","c","b","c","a"},
                        1
                )
        );
    }

    /**
     * Problem:
     * Solution: Implement a two-pass algorithm with a HashMap to record and retrieve where distinct letters are located.
     * @param arr - An array of strings.
     * @param k - The desired position of some value when sorted in order of occurences.
     * @return The kth letter that appears once in the list.
     */
    public static String kthDistinct(String[] arr, int k) {
        //Two-Pass Solution
        HashMap<String, Integer> map = new HashMap<>();

        /*
            First-pass: Count the instances of each letter.
        */
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        /*
            Second-pass: Find the k-th instance of a distinct letter
                by decrementing the k variable.
        */
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                k--;
            }
            if (k == 0) {
                return arr[i];
            }
        }

        return "";
    }
}