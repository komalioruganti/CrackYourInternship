// https://leetcode.com/problems/set-matrix-zeroes/
//Given Array SIze : M*N
//Time Complexity: O(M*N)
//Space Complexity: O(M) + O(N)

class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] r = new int[n];
        int[] c = new int[m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m ;j++){
                if(matrix[i][j] == 0){
                    r[i]=1;
                    c[j] = 1;
                }
            }
        }
        for(int i = 0;i<n;i++){
             if(r[i] == 1){
            for(int j = 0;j<m;j++){
               matrix[i][j] = 0;
            }}
            
        }
        for(int j = 0;j<m;j++){
            if(c[j] == 1){
                for(int i = 0;i<n;i++){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}