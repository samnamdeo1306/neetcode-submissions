class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            int x = numbers[i];
            int index = map.getOrDefault(target - x, -1);
            if(index != -1) {
                return new int[]{index, i + 1};
            } else {
                map.put(x, i + 1);
            }
        }

        return new int[]{};
    }
}
