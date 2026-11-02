class NumMatrix {
    int[][] prefix;
    public NumMatrix(int[][] matrix) {
        int n = matrix.length,m=matrix[0].length;
        prefix = new int[n][m];
        int sum=0;
        for(int i=0;i<m;i++){
            sum+=matrix[0][i];
            prefix[0][i] = sum;
        }
        sum=0;
        for(int i=0;i<n;i++){
            sum+=matrix[i][0];
            prefix[i][0] = sum;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                prefix[i][j] = matrix[i][j]+prefix[i-1][j]+prefix[i][j-1]-prefix[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(col1==0 && row1==0){
            return prefix[row2][col2];
        }else if(col1==0){
            return prefix[row2][col2]-prefix[row1-1][col2]; 
        }else if(row1==0){
            return prefix[row2][col2]-prefix[row2][col1-1];
        }
        return prefix[row2][col2]-prefix[row1-1][col2]-prefix[row2][col1-1] + prefix[row1-1][col1-1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */