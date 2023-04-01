public class ContainerWithMostWater_11 {

    public static void main(String[] args) {
        System.out.println(new ContainerWithMostWater_11().maxArea1(new int[] {1,8,6,2,5,4,8,3,7}));

        System.out.println(new ContainerWithMostWater_11().maxArea2(new int[] {1,8,6,2,5,4,8,3,7}));
    }
    // brute force solution
    public int maxArea1(int[] height) {
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 1; j < height.length; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                res = Math.max(area, res);
            }
        }
        return res;
    }

    // liner time O(n) solution
    public int maxArea2(int[] height) {
        int res = 0;
        int start = 0;
        int end = height.length - 1;

        while (start <= end) {
            int area = (end - start) * Math.min(height[start], height[end]);
            res = Math.max(area, res);
            if(height[start] < height[end]) {
                start++;
            }
            else if (height[start] > height[end]) {
                end--;
            }
            else {
                start++;
            }
        }
        return res;
    }
}
