package algo.字符串;

public class 二进制求和 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';//charAt获取值后减去'0'(48)差值
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

//    public String addBinary(String a, String b) {
//        char[] s1 = a.toCharArray();
//        char[] s2 = b.toCharArray();
//        int len1 = s1.length-1;
//        int len2 = s2.length-1;
//        String res= "";
//        // 进位的值，0表示不进位（进位0），1表示进位1
//        int add1 = 0;
//        int num;
//        int t1,t2;
//        while (len1>=0||len2>=0) {
//            if (len1>=0){ t1 = (int)s1[len1]-48; }else t1=0;
//            if (len2>=0){ t2 = (int)s2[len2]-48; }else t2=0;
//            num = t1+t2+add1;
//            res = num%2 + res;
//            add1 = num/2;
//            len1--;
//            len2--;
//        }
//        if (add1==1){
//            res = '1'+res;
//        }
//        return res;
//    }

    public static void main(String[] args) {
        String a = "1", b = "11";
        String s = new 二进制求和().addBinary(a, b);
        System.out.println(s);
    }
}
