package BInary_Search;

/**
 * BinarySearchOn2DArray
 */
public class BinarySearchOn2DArray {

    public static void main(String[] args) {
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        int target2=90;
        int target3=16;
        System.out.println(searchMatrix(arr, target));
        System.out.println(searchMatrix(arr, target2));
        System.out.println(searchMatrix(arr, target3));
    }
     public static  boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;// row size;
        int m=matrix[0].length;// col size
        int low=0;
        int high=(n*m)-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target){
                return  true;
            }else if(matrix[row][col]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
}