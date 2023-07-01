class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> freq = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0)+1);
        }
        int maxLucky = -1 ;
        for(Integer key: freq.keySet()){
            if(freq.get(key)==key){
                maxLucky = Math.max(maxLucky,key);
            }
        }

        return maxLucky;
    }
}