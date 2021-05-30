package GetTheOffer.Offer04;

public class Solution {
    /**
     *
     * 把光标放在右上角的元素上：
     * 如果该元素小于target则下移光标，
     * 如果该元素大于target则左移光标，
     * 若等于则返回true，若越界则返回false。
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length<=0){
            return false;
        }
        int i=0;
        int j=matrix[0].length-1;
        while(i<matrix.length&&j>=0){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]<target){
                i++;
            }else if(matrix[i][j]>target){
                j--;
            }
        }

        return false;
    }
}
