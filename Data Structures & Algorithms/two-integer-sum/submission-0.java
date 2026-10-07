class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int x = map.getOrDefault(target - nums[i], -1);
            if(x != -1) {
                return new int[]{x, i};
            } else {
                map.putIfAbsent(nums[i], i);
            }
        }
        return new int[2];
    }
}
