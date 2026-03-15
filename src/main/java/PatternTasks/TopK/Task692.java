package PatternTasks.TopK;

import java.util.*;

public class Task692 {
    public static void main(String[] args) {
        String[] words = new String[] {"i","love","leetcode","i","love","coding"};
        int k = 2;
        System.out.println(topKFrequent(words, k));
    }

    public static List<String> topKFrequent(String[] words, int k) {

        final Map<String, Integer> wordFreq = new HashMap<>();

        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue<>(
                        Comparator
                                .comparing(Map.Entry<String, Integer>::getValue).reversed()
                                .thenComparing(Map.Entry<String, Integer>::getKey)
                );

        pq.addAll(wordFreq.entrySet());

        List<String> res = new ArrayList<>();

        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            res.add(pq.poll().getKey());
        }

        return res;
    }
}
