class Solution {
   public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0 ;
        int rows = matrix.length ;
        int cols = matrix[0].length;
        int end = rows*cols -1 ;

        while(start <= end){
            int mid= (start+end)/2; 
            int i = mid / cols ; 
            int j = mid % cols ;
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target) end = mid-1;
            else start=mid+1;
        }

        return false;
    }
}