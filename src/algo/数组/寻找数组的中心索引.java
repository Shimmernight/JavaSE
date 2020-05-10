package algo.数组;

/**
 * 寻找数组的中心索引
 * <p>
 * 给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。
 * 我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 */

class 寻找数组的中心索引 {
    public int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        // 1.求数组之和
        for (int num : nums) {
            sum += num;
        }
        //System.out.println(sum);
        // 2.遍历查找中心索引
        for (int i = 0; i < nums.length; i++) {
            //int rightSum = sum-nums[i]-leftSum;
            if (leftSum == sum - nums[i] - leftSum) {    //左右相等
                return i;
            }
            leftSum += nums[i];
        }
        return -1;


/*      int n = 0;
        for (int i = 0; i < nums.length; i++) {//遍历数组
            int n1 = 0;
            for (int j = i + 1; j < nums.length; j++) {//右边之和
                n1 += nums[j];
            }
            if (n == n1) {
                return i;
            }
            n += nums[i];//左边之和
        }
        return -1;*/
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int i = new 寻找数组的中心索引().pivotIndex(nums);
        System.out.println(i);
    }
}