class Solution {
    public int findMin(int[] nums) {
        // int n = nums.length;
        // int start = 0;
        // int end = n-1;
        // while(start < end){
        //     int mid = start + (end-start)/2;
        //     if(nums[end] <  nums[mid]){
        //         start = mid + 1;
        //     }else{
        //         end = mid;
        //     }
        // }
        // return nums[start];


        int n = nums.length;
        int start = 0;
        int end = n-1;
        int ans = nums[0];

        while(start <= end){
            if(nums[start] < nums[end]){
                ans = Math.min(ans, nums[start]);
            }
            int mid = start + (end - start) / 2;
            ans = Math.min(ans, nums[mid]);
            if(nums[start] <= nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
