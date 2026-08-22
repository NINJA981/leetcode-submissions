class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer > freq = new HashMap<>();
        for(int num : nums){
            
            freq.put(num , freq.getOrDefault(num,0)+ 1);
        }
        
        int [] result = new int[k];
        int count = 0;

        PriorityQueue<Map.Entry<Integer, Integer>> heap =
    new PriorityQueue<>((a, b) -> Integer.compare(a.getValue(), b.getValue()));

    for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
        heap.add(entry);
        if (heap.size() > k) {
            heap.poll();
        }
    }

    for (int i = 0; i < k; i++) {
    result[i] = heap.poll().getKey();
}

    return result;
    }
}