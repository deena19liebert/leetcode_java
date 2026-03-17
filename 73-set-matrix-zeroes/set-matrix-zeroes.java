class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    rows[i] = true; // entire row becomes true. Example 1: |False |True |False|
                    cols[j] = true; // entire column becomes true. |False |True |False|
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(rows[i] || cols[j] == true){
                    matrix[i][j] = 0;  // when either the row or column is found to be True, it will give 0.
                }
            }
        }
    }
}
//FOR MATRIX CONTAINING ONLY ZEROES AND ONES
// class Solution {
//     public void setRow(int[][] matrix, int i){
//         int m = matrix[0].length;
//         for(int j=0; j<m; j++) {
//             if(matrix[i][j] != 0)
//                 matrix[i][j] = -1;
//         }
//     }
//     public void setColumn(int[][] matrix, int j){
//         int n = matrix.length;
//         for(int i=0; i<n; i++) {
//             if(matrix[i][j] != 0)
//                 matrix[i][j] = -1;
//         }
//     }
//     public void setZeroes(int[][] matrix) {
//         int n = matrix.length;
//         int m = matrix[0].length;
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(matrix[i][j] == 0){
//                     setRow(matrix, i);
//                     setColumn(matrix, j);
//                 }
//             }
//         }
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(matrix[i][j] == -1){
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }
// }