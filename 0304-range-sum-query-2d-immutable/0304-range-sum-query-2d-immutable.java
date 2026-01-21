class NumMatrix {
    
    int[][] prefix;
    public NumMatrix(int[][] matrix) {
        prefix = new int[matrix.length][matrix[0].length];
        prefix[0][0] = matrix[0][0];

        int x = prefix.length;
        int y = prefix[0].length;

        for(int i=0;i<x;i++) {
            for(int j=0;j<y;j++) {
                int top = (i > 0)? prefix[i-1][j] : 0;
                int left = (j > 0)? prefix[i][j-1] : 0;
                int diagonal = (i>0 && j>0)? prefix[i-1][j-1] : 0;
                prefix[i][j] = top + left - diagonal + matrix[i][j];
            }
        }
    }
    
        public int sumRegion(int row1, int col1, int row2, int col2) {
        int total = prefix[row2][col2];
        int top = (row1 > 0) ? prefix[row1 - 1][col2] : 0;
        int left = (col1 > 0) ? prefix[row2][col1 - 1] : 0;
        int diag = (row1 > 0 && col1 > 0) ? prefix[row1 - 1][col1 - 1] : 0;

        return total - top - left + diag;
    }

}
