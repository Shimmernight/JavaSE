package javaSE.zxl.struct;

public class ForDemo03 {
    //九九乘法表
    public static void main(String[] args) {
        //1.打印第一列
        //2.把固定的1在用一个for循环包裹
        //3.去除重复项,i<=j
        //4.调整样式

        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
