class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map_st = new HashMap<Character,Character>() ;
        Map<Character,Character> map_ts = new HashMap<Character,Character>() ;
        for(int i=0;i<s.length();i++){
            if(map_st.containsKey(s.charAt(i))){
                if(!map_st.get(s.charAt(i)).equals(t.charAt(i))) return false ;
            }
            else{
                map_st.put(s.charAt(i),t.charAt(i));
            }
            
            if(map_ts.containsKey(t.charAt(i))){
                if(!map_ts.get(t.charAt(i)).equals(s.charAt(i))) return false ;
            }
            else{
                map_ts.put(t.charAt(i),s.charAt(i));
            }
        }
        
        return true;
    }
}