package javaSE.zxl.base;

public class 基本数据类型 {
    public static void main(String[] args) {

        /**
         * 注：long型需要加‘L’，float型需要加‘f’！
         */
        //整数
        byte num0 = 127;        //一个字节 -128~127
        short num1 = 32767;     //两个字节 -32768~32767
        int num2 = 2147483647;  //四个字节 -2147483648~2147483647
        long num3 = 9223372036854775807L;//8个字节 -9223372036854775808~9223372036854775807

        //浮点数(小数)
        float num4 = 214748364.7f; //四个字节
        double num5 = 922337203685477580.7;

        //字符
        char cha = '中';

        //布尔
        boolean bl = true;
    }
}
