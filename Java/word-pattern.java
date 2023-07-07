import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String,Character> pMap = new HashMap<>();
        String words[] = s.split(" ");

        for (int i = 0; i < pattern.length(); i++) {
            if(pMap.containsKey(pattern.charAt(i))){
                if(!pMap.get(pattern.charAt(i)).equals(words[i])) return false;
            }
            else{
                pMap.put(pattern.charAt(i), words[i]);
            }
        }
        return true;
    }
}