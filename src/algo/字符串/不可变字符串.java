package algo.字符串;


/**
 * 在 Java 中，由于字符串是不可变的，
 * 因此在连接时首先为新字符串分配足够的空间，复制旧字符串中的内容并附加到新字符串。
 * 因此，总时间复杂度将是：O(n2)
 */
public class 不可变字符串 {
    public static void main(String[] args) {
        String s = "Hello World";
        new 不可变字符串().strToArray(s);
        new 不可变字符串().strToSBuilder(s);
    }

    //1. 如果你确实希望你的字符串是可变的，则可以将其转换为字符数组。
    public void strToArray(String s){
        char[] str = s.toCharArray();
        str[5] = ',';
        System.out.println(str);
    }

    //2. 如果你经常必须连接字符串，最好使用一些其他的数据结构，如 StringBuilder 。 以下代码以 O(n) 的复杂度运行。
    public void strToSBuilder(String s){
        StringBuilder builder = new StringBuilder();
        builder.append(s);
        builder.append(",java");
        System.out.println(builder.toString());
    }

}
