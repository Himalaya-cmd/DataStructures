class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row=0;
        int col=0;
        while (row < rows - row && col < cols - col){
            for(int i=col;i<=cols-col-1;i++){
                list.add(matrix[row][i]);
            }
            for(int i=row+1;i<=rows-row-1;i++){
                list.add(matrix[i][cols-col-1]);
            }
            if(rows-row-1>row){
                for(int i=cols-col-2;i>=col;i--){
                    list.add(matrix[rows-row-1][i]);
                }
            }
            if(cols-col-1>col){
                for(int i=rows-row-2;i>row;i--){
                    list.add(matrix[i][col]);
                }
            }
            col++;
            row++;
        }
        return list;  
    }
}