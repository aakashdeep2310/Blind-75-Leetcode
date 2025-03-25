class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int mini = nums[0];
        int maxi = nums[0];
        int ans = nums[0];
        for(int i = 1; i<n; i++){
            int a = nums[i];
            int b = nums[i] * mini;
            int c = nums[i] * maxi;
            mini = Math.min(a, Math.min(b, c));
            maxi = Math.max(a, Math.max(b, c));
            ans = Math.max(ans, maxi);
        }
        return ans;
    }
}
