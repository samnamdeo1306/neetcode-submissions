class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] fwdProds = new int[nums.length];
        int[] backProds = new int[nums.length];
        int fwdProd = 1, backProd = 1;
        for(int i = 0; i < nums.length; i++) {
            fwdProd *= nums[i];
            backProd *= nums[nums.length - i - 1];
            fwdProds[i] = fwdProd;
            backProds[nums.length - i - 1] = backProd;
        }

        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int prod = 1;
            if(i >= 1) {
                prod *= fwdProds[i - 1];
            }
            if(i < nums.length - 1) {
                prod *= backProds[i + 1];
            }
            res[i] = prod;
        }

        return res;
    }
}  
