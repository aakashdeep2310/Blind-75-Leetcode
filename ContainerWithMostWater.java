class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxSum = 0;
        int i = 0;
        int j = n-1;
            while(i<j){
                int sum = Math.min(height[i], height[j]) * (j - i);
                maxSum = Math.max(maxSum, sum);
                if(height[i] < height[j]){
                    i++;
                }else{
                    j--;
                }
            }
        return maxSum;
    }
}
