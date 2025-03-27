// Brute Force O(n^2)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        int arr[] = new int[2];
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}

// Using HashMap O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        int arr[] = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            Integer find = target - nums[i];
            if(map.containsKey(find)){
                arr[0] = map.get(find);
                arr[1] = i;
                return arr;
            }
            map.put(nums[i], i);
        }
        return arr;
    }
}
