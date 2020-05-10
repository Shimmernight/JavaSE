package algo.数组;

import java.util.Arrays;

/**
 * 数组是一种基本的数据结构，用于按顺序存储元素的集合。
 * 但是元素可以随机存取，因为数组中的每个元素都可以通过数组索引来识别。
 */
public class 静态数组 {
    public static void main(String[] args) {
        // 1. Initialize
        int[] a0 = new int[5];
        int[] a1 = {1, 2, 3};
        // 2. Get Length
        System.out.println("The size of a1 is: " + a1.length);
        // 3. Access Element
        System.out.println("The first element is: " + a1[0]);
        // 4. Iterate all Elements
        System.out.print("[方式 1] The contents of a1 are:");
        for (int i = 0; i < a1.length; ++i) {
            System.out.print(" " + a1[i]);
        }
        System.out.println();
        System.out.print("[方式 2] The contents of a1 are:");
        for (int item: a1) {
            System.out.print(" " + item);
        }
        System.out.println();
        // 5. Modify Element
        a1[0] = 4;
        // 6. Sort排序
        Arrays.sort(a1);
        System.out.print("[排序后] a1的内容为：");
        for (int item : a1) {
            System.out.print(" "+item);
        }
    }
}
