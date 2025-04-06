class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

////////////////// Using Set

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
