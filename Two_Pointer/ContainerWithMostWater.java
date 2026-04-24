package Two_Pointer;
//Problem: 11 Leetcode Container width most water
//Time: O(n)
//Space: O(1)
public class ContainerWithMostWater {
  public static void main(String[] args) {
    int[] arr={1,8,6,2,5,4,8,3,7};
    System.out.println(containsMostwater(arr));
  }  
    public static int containsMostwater(int[] height){
        int i=0;
        int j=height.length-1;
        int width=0;
        int area=0;
        int value=0;
        while(i<j){
            width=j-i;
            value=Math.min(height[i],height[j])*width;
            if(value>area){
                area=value;
            }
            
             if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
    
        }
        return area;
    }
}
