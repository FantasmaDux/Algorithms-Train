package PatternTasks.TopK;

import java.util.*;

public class Task692 {
    public static void main(String[] args) {
        String[] words = new String[] {"i","love","leetcode","i","love","coding"};
        int k = 2;
        System.out.println(topKFrequent(words, k));
    }

    public static List<String> topKFrequent(String[] words, int k) {

        final HashMap<String, Integer> freqWords = new HashMap<>();

        for (String s : words) {
            freqWords.put(s, freqWords.getOrDefault(s, 0) +1);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue() == b.getValue() ?
                        a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue()
        );

        for (Map.Entry<String, Integer> entry : freqWords.entrySet()) {
            pq.add(entry);
        }

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(pq.poll().getKey());
        }
        return ans;
    }
}
