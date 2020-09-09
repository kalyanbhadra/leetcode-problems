/**
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 */

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] x = {1,8,6,2,5,4,8,3,7};
        System.out.println(new ContainerWithMostWater().maxArea(x));
    }

    public int maxArea(int[] x) {
        int res = 0;
        int low = 0;
        int high = x.length - 1;

        while(low < high){
            res =  Math.max(Math.min(x[low], x[high]) * (high-low), res);
            if(x[low] < x[high]){
                low++;
            }
            else {
                high--;
            }
        }
        return res;
    }
}
