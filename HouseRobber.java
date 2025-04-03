class Solution {
    public int rob(int[] nums) {

        int n = nums.length;
        int sum = 0;
        int sum2 = 0; 

        if(n==0) return 0;
        if(n==1) return nums[0];

        for(int num : nums){
            int rob = Math.max(sum, sum2 + num);
            sum2 = sum;
            sum = rob; 
        }
        return sum;
        
    }
}
