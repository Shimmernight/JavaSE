package algo.数组;

import java.util.Arrays;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class 加一 {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        for (int i = size - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] >= 10) {
                digits[i]=0;
            }else {
                return digits;
            }
        }
        digits = new int[size+1];
        digits[0]=1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9,9};
        System.out.println(Arrays.toString(digits));
        int[] ints = new 加一().plusOne(digits);
        System.out.println(Arrays.toString(ints));
    }
}
