class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<Map<Character, Integer>, List<String>> mapList = new HashMap<>();

        for (String str : strs) {
            Map<Character, Integer> freq = new HashMap<>();
            for (char ch : str.toCharArray()) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
            boolean found = false;
            for (var map : mapList.keySet()) {
                if (map.equals(freq)) {
                    mapList.get(map).add(str);
                    found = true;
                    break;
                }
            }
            if (!found) {
                List<String> list = new ArrayList<>();
                list.add(str);
                mapList.put(freq, list);
            }
        }

        return new ArrayList<>(mapList.values());
    }
}