package algo.数组;


/**
 * 至少是其他数字两倍的最大数
 * <p>
 * 在一个给定的数组nums中，总是存在一个最大元素 。
 * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 * 如果是，则返回最大元素的索引，否则返回-1。
 */
public class 至少是其他数字两倍的最大数 {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        // 1.找到最大值
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>nums[maxIndex]){
                maxIndex=i;
            }
        }
        //System.out.println("max:"+maxIndex);
        // 2.用最大值判断条件
        for (int num : nums) {
            if (num!=nums[maxIndex] && (nums[maxIndex] < 2 * num)) {
                return -1;
            }
        }
        return maxIndex;

/*        for (int i = 0; i < size; i++) {    //从左往右
            for (int j = i + 1; j < size; j++) {
                if (nums[i] >= 2 * nums[j]) {
                    if (j == size - 1) {
                        if (Math.max(nums[i], max) == nums[i]) {
                            max = nums[i];
                            maxIndex = i;
                        }
                    }
                }else {
                    break;
                }
            }
        }
        for (int i = size-1; i >= 0; i--) {  //从右往左
            for (int j = i - 1; j >=0; j--) {
                if (nums[i] >= 2 * nums[j]) {
                    if (j == 0) {
                        if (Math.max(nums[i], max) == nums[i]) {
                            max = nums[i];
                            maxIndex = i;
                        }
                    }
                }else {
                    break;
                }
            }
        }
        return maxIndex;*/
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};
        int i = new 至少是其他数字两倍的最大数().dominantIndex(nums);
        System.out.println("两倍的最大数为：" + i);
    }
}
