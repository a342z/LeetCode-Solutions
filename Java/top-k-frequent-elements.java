class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap = new HashMap<Integer,Integer>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
        }

        Queue<Map.Entry<Integer,Integer>> priorityQueue = new PriorityQueue<Map.Entry<Integer,Integer>>((a, b) -> b.getValue()-a.getValue());
        for(Map.Entry<Integer,Integer> e: frequencyMap.entrySet()){
            priorityQueue.add(e);
        }

        int out[] = new int[k];
        for(int i =0;i<k;i++){
         out[i]=priorityQueue.poll().getKey();   
        }

        return out;
    }
}