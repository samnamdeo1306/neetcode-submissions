class Solution {
    public boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        str = str.toLowerCase();
        while(l < r) {
            char s = str.charAt(l);
            if(!isAlphaNumeric(s)) {
                l++;
                continue;
            }

            char e = str.charAt(r);
            if(!isAlphaNumeric(e)) {
                r--;
                continue;
            }
            //System.out.println(s + ", " + e);
            if(s == e) {
                l++;
                r--;
                continue;
            }
            else
                return false;
        }

        return true;
    }

    private boolean isAlphaNumeric(char c) {
        if((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z'))
            return true;
        return false;
    }
}
