package math.接雨水42;

/*
    解题思路：
    在最大值左边不严格递增，右边不严格递减。
    因此只需要把原数组变成符合这样要求的数组就行了，改变的量就是接的雨水。

    1.先找到最大值索引，左右各自遍历一遍
    2.两边都维护一个值来表示之前的最大值以保证单调性，
    3.如果比最大值小，雨水量就加上这个差值，
    4.如果大于等于，就更新最大值。
 */

public class Solution02 {
    public int trap(int[] height){
        int result = 0;
        int size = height.length;
        if(size==0){return 0;}//防止输入空数组，下标越界
        int max  = getMax(height);

        //左边最大值
        int cur = height[0];
        for (int i = 1; i < max; i++) {//最大值左边
            if (height[i]<cur){//当递减时
                result += cur-height[i];
            }else if (height[i]>=cur){//当不变或递增时
                cur = height[i];
            }
        }
        //右边最大值
        cur = height[size-1];
        for (int i = size-2; i >max; i--) {//最大值右边
            if (height[i]<cur){
                result += cur-height[i];
            }else if (height[i]>=cur){
                cur = height[i];
            }
        }
        return result;
    }


    private int getMax(int[] h) {
        int result = 0;
        for (int i = 1; i < h.length; i++) {
            if (h[i]>h[result]){
                result = i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Solution02 s2 = new Solution02();
        int[] l = {4,2,0,3,2,5};
        int trap = s2.trap(l);
        System.out.println("可以接"+trap+"滴水");
    }
}
