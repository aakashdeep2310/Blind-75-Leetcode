class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] matrix = new int[n+1][m+1];
        for(int j = m -1; j>=0; j--){
            for(int i = n-1; i>=0; i--){
                if(text1.charAt(i) == text2.charAt(j)){
                    matrix[i][j] = 1 + matrix[i+1][j+1]; 
                }else{
                    matrix[i][j] = Math.max(matrix[i+1][j], matrix[i][j+1]);
                }
            }
        }
        return matrix[0][0];
    }
}
