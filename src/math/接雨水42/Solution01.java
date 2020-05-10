package math.接雨水42;

public class Solution01 {
    public int trap(int[] height) {
        int result = 0;
        int size = height.length;
        for(int i = 1; i<size-1; i++){//遍历数组，去掉首尾
            int Max_left = 0;
            int Max_right = 0;
            for(int j = i;j>=0;j--){//向左遍历
                Max_left = Math.max(Max_left,height[j]);
            }
            for(int j=i;j<size;j++){//向右遍历
                Max_right = Math.max(Max_right,height[j]);
            }
            result +=Math.min(Max_left,Max_right)-height[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution01 s1 = new Solution01();
        int[] l = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trap = s1.trap(l);
        System.out.println("可以接"+trap+"滴水");
    }
}

