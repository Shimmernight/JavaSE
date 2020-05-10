package algo.比赛;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 数组中的字符串匹配 {
//    public List<String> stringMatching(String[] words) {
//        List<String> res = new ArrayList<>();
//        for (int i = 0; i < words.length; i++) {
//            for (int j = i+1; j < words.length; j++) {
//                if (words[i].contains(words[j])){
//                    res.add(words[j]);
//                }else if (words[j].contains(words[i])){
//                    res.add(words[i]);
//                }
//            }
//        }
//        int num = 0;
//        for (int i = 0; i < res.size(); i++) {
//            for (int j = i+1; j < res.size(); j++) {
//                if (res.get(i).equals(res.get(j))){
//                    res.set(i,"0");
//                    num++;
//                }
//            }
//        }
//        for (int i = res.size()-1; i >=0; i--) {
//            if (res.get(i).equals("0")){
//                res.remove(i);
//            }
//        }
//        return res;
//    }

    /**
     * 解题思路
     * 两次循环
     * 第一次遍历数组拼接成一个长字符串S
     * 第二次遍历数组查找字符串在S中出现的位置，如果是别人的子串，那么在S中的出现次数一定 >= 2，那么起始跟结束的位置索引一定是不一样的，如果一样说明不是子串。
     * 注意：为了避免前一字符串的尾部与后一字符串的头部构成混淆项，各字符串用,隔开拼接。
     */
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        if (words.length == 0) return list;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            builder.append(str + ",");
        }
        System.out.println(builder.toString());
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
//            System.out.print(builder.toString().indexOf(str)+",");
//            System.out.println(builder.toString().lastIndexOf(str));
            //lastIndexOf:字符串最后出现的字符串起始坐标
            if (builder.toString().indexOf(str) != builder.toString().lastIndexOf(str)) list.add(str);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] words = {"leetcoder", "leetcode", "aet", "code"};
        List<String> strings = new 数组中的字符串匹配().stringMatching(words);
        System.out.print(strings);
    }
}
