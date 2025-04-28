class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int left[] = new int[n];
        left[0] = 1;
        for(int i = 1; i<n; i++){
            left[i] = nums[i-1] * left[i-1];
        }

        int right[] = new int[n];
        right[n-1] = 1; 
        for(int i = n-2; i>=0; i--){
            right[i] = nums[i+1] * right[i+1];
        }

        int ans[] = new int[n];
        for(int i = 0; i<n; i++){
            ans[i] = left[i] * right[i];
        }
        return ans;
        


         // Optimal Solution********************************************
        int ans[] = new int[n];
        int prefix = 1;
        for(int i = 0; i<n; i++){
            ans[i] = prefix;
            prefix *= nums[i];
        }

        
        int postfix = 1;
        for(int i = n-1; i>=0; i--){
            ans[i] *= postfix;
            postfix *= nums[i];
        }
        return ans;
    }
}
