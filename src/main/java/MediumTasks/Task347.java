package MediumTasks;

import java.util.ArrayList;
import java.util.HashMap;

public class Task347 {


    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> count = new HashMap<>();
        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer>[] freq = new ArrayList[nums.length + 1];

        for (int key : count.keySet()) {
            int frequency = count.get(key);
            if (freq[frequency] == null) {
                freq[frequency] = new ArrayList<>();
            }
            freq[frequency].add(key);
        }

        int[] res = new int[k];
        int j = 0;
        for (int i = freq.length-1; i >= 0; i--) {
            if (freq[i] != null) {
                for (int value : freq[i]) {
                    res[j++] = value;
                    if (j==k) return res;
                }
            }
        }
        return res;

    }
}
