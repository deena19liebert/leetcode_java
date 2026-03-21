//OPTIMAL APPROACH
class Solution {
    public void swap(int[][] matrix, int start, int end){
        int temp = matrix[start][end];
        matrix[start][end] = matrix[end][start];
        matrix[end][start] = temp;

    }
    public void reverse(int[][] matrix, int start, int end){
        while(start < end){
            swap(matrix, start, end);
            start++;
            end--;
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        // Step 1: TRANSPOSE
        for(int i=0; i<n; i++){
            for(int j=i+1; j<m; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Step 2: Reverse each row
        for(int i=0; i<n; i++){
            int start = 0, end = n-1;
            while(start < end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}
//BETTER APPROACH
//TC: O(n×m)+O(n×m)=O(n×m), SC: O(nxm)
// class Solution {
//     public void rotate(int[][] matrix) {
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int[][] result = new int[n][m];
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 result[j][n-1-i] = matrix[i][j];
//             }
//         }
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 matrix[i][j] = result[i][j];
//             }
//         }
//     }
// }