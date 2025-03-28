class Solution {
    public int climbStairs(int n) {
        // dynamic programming
        if(n == 1){
            return 1;
        }
        int one = 1;
        int two = 2;

        for(int i = 3; i<=n; i++){
            int total = one + two;
            one = two;
            two = total;
        }
        return two;
    }
}
