class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int n = s.length();
        int l = 0, r = 0;
        Set<Character> set = new HashSet<>();

        while(r<n){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                maxLen = Math.max(maxLen, r-l+1);
                r++;
            }else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return maxLen;
    }
}
