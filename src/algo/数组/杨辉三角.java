package algo.数组;

import java.util.ArrayList;
import java.util.List;

public class 杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> YHTriangle = new ArrayList<>();
        if(numRows==0){return YHTriangle;}
        List<Integer> list = new ArrayList<>();
        List<Integer> pre;
        list.add(1);
        YHTriangle.add(list);

        for (int i = 1; i < numRows; i++) {
            pre = list;//保存前一行
            list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {//行首和行尾
                    list.add(1);
                } else {
                    //其他元素的值是其正上方与左上方元素的和
                    list.add(pre.get(j) + pre.get(j - 1));
                }
            }
            YHTriangle.add(list);
        }
        return YHTriangle;
    }

    public static void main(String[] args) {
        List<List<Integer>> generate = new 杨辉三角().generate(8);
        System.out.println(generate);
    }
}
