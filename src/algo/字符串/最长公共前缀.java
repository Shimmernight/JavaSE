package algo.字符串;

public class 最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].isEmpty()) {
            return "";
        }
        String tmp = strs[0];
        if (strs.length == 1) {
            return tmp;
        }

        for (int j = 1; j < strs.length; j++) {
            for (int i = 0; ; i++) {
                if (tmp.charAt(i) != strs[j].charAt(i)||i == tmp.length()) {
                    return tmp.substring(0, i);
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] strs = {"c", "c"};
        String s = new 最长公共前缀().longestCommonPrefix(strs);
        System.out.println(s);
    }
}
