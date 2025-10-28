class Solution {
    public boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) return false;

        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();

        for (char ch : word1.toCharArray()) {
            freq1.put(ch, freq1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : word2.toCharArray()) {
            freq2.put(ch, freq2.getOrDefault(ch, 0) + 1);
        }

        List<Character> keys1 = new ArrayList<>(freq1.keySet());
        List<Character> keys2 = new ArrayList<>(freq2.keySet());
        Collections.sort(keys1);
        Collections.sort(keys2);

        if (!keys1.equals(keys2)) return false;

        List<Integer> values1 = new ArrayList<>(freq1.values());
        List<Integer> values2 = new ArrayList<>(freq2.values());
        Collections.sort(values1);
        Collections.sort(values2);

        return values1.equals(values2);
    }
}