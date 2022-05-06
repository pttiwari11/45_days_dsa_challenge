class Solution {
    public void setZeroes(int[][] matrix) {
        
        // Use First row and First col as meta data to store zero
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        boolean row = false, col = false;
        
        // Check first col is having any zero or not
        for(int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                col = true;
                break;
            }
        } 
        
        // Check first row is having any zero or not
        for(int i = 0; i < m; i++) {
            if (matrix[0][i] == 0) {
                row = true;
                break;
            }
        } 
        
        // Update First row and first col value based on inner matrix
        for(int i = 1; i < n ; i++) {
            for(int j = 1; j < m; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        
        // Update Inner matrix's values based on it's respective row and col
        for(int i = 1; i < n ;i++) {
            for(int j = 1; j < m; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        // If First row had intially 0 then update whole row with 0
        if(row) {
            for(int i = 0; i < m; i++) {
                matrix[0][i] = 0;
            }
        }
        
        // If First col had initially 0 then update whole col with 0
        if(col){
            for(int i= 0; i<n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}