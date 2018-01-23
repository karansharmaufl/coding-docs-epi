class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int width = matrix[0].length;
        int height = matrix.length;
        
        System.out.println("Width"+ width);
        System.out.println("Height"+ height);
        
        for(int i=0;i<height-1;i++){
            for(int j=0; j<width-1;j++){
                if(matrix[i][j] != matrix[i+1][j+1]){  
                    return false;
                }
            }
        }
        
        return true;
    }
}
