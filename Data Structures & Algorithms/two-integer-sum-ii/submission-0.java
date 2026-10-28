class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            int x = numbers[i];
            if(map.containsKey(target - x)) {
                return new int[]{map.get(target - x), i + 1};
            } else {
                map.put(x, i + 1);
            }
        }

        return new int[]{};
    }
}
