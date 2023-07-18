class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");
        var words = s.trim().split("\\s+");
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]+" ");
        }

        sb.deleteCharAt(sb.length()-1);
        return sb.substring(0, sb.length());

    }
}