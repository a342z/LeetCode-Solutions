class Solution {
    public int compress(char[] chars) {
        int ptr = 0;
        int temp = 1;
        char ch = chars[0];

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == ch) {
                temp++;
            } else {
                chars[ptr++] = ch;
                if (temp > 1) {
                    for (char c : String.valueOf(temp).toCharArray()) {
                        chars[ptr++] = c;
                    }
                }
                ch = chars[i];
                temp = 1;
            }
        }
        chars[ptr++] = ch;

        if (temp > 1) {
            for (char c : String.valueOf(temp).toCharArray()) {
                chars[ptr++] = c;
            }
        }

        return ptr;
    }
}