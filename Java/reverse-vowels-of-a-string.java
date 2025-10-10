import java.util.Set;

class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            while (i < j && !vowels.contains(s.charAt(i))) {
                i++;
            }

            while (i < j && !vowels.contains(s.charAt(j))) {
                j--;
            }
            if (vowels.contains(s.charAt(i)) && vowels.contains(s.charAt(j))) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);

    }
}