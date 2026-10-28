class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int seqLen = 0;

        for(int i : nums) {
            set.add(i);
        }

        int currLen = 1;
        for(int start : nums) {
            if(set.contains(start - 1))
                continue;
            int x = start + 1;
            while(set.contains(x)) {
                currLen++;
                x++;
            }

            if(currLen > seqLen) {
                seqLen = currLen;
            }
            currLen = 1;
        }

        return seqLen;
    }
}
