class Solution {
    public boolean isAnagram(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if(slen != tlen)
            return false;

        int[] map = new int[26];
        for(char c : s.toCharArray()) {
            map[c - 'a']++;
        }

        for(char c : t.toCharArray()) {
            if(map[c - 'a'] == 0) {
                return false;
            } else {
                map[c - 'a']--;
            }
        }

        return true;
    }
}
