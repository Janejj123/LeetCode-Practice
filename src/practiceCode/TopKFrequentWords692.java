package practiceCode;

import java.util.*;

public class TopKFrequentWords692 {
    public List<String> topFrequentWord (String[] words, int n) {
        List<String> result = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i]))
                map.put(words[i], map.get(words[i])+1);
            else
                map.put(words[i], 1);
        }

        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<Map.Entry<String, Integer>>(
                (a,b) -> a.getValue() == b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue() - b.getValue()
        );

        for (Map.Entry<String,Integer> entry: map.entrySet()) {
            pq.offer(entry);
            if(pq.size()>n)
                pq.poll();
        }

        while (!pq.isEmpty())
            result.add(0, pq.poll().getKey());

        return result;
    }
}
