package algo.字符串;

/**
 * 给定一个 haystack 字符串和一个 needle 字符串，
 * 在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
 * 如果不存在，则返回  -1。
 */
public class 实现strStr {
    public int strStr(String haystack, String needle) {
        if (needle.length()==0){return 0;}
        int h = haystack.length(),n = needle.length();
        for (int start = 0; start < h-n+1; start++) {
            //沿着字符换逐步移动滑动窗口，将窗口内的子串与 needle 字符串比较。
            if (haystack.substring(start,start+n).equals(needle)){
                return start;
            }
        }
        return -1;
    }
//    public int strStr(String haystack, String needle) {
//        if (needle.length()==0){return 0;}
//        int index = 0;
//        int offSet = 0;
//        for (int i = 0; i < haystack.length(); i++) {
//            if (haystack.charAt(i) == needle.charAt(index)) {
//                index++;
//                if (index == needle.length()) {
//                    return i - (index - 1)-offSet;
//                }
//            }
//            else if (i>1&&haystack.charAt(i-2) == needle.charAt(index)) {
//                index++;
//                offSet = 2;
//            }
//            else index = 0;
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issip";
        int i = new 实现strStr().strStr(haystack, needle);
        System.out.println(i);

        for (int j = 0; j < 10; j++) {
            System.out.print(1);
        }
        System.out.println();
        for (int j = 0; j < 10; ++j) {
            System.out.print(1);
        }
    }
}
