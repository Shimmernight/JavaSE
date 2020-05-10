package math.求最大值;


//数组最大值下标
public class ArrayMax {
    private int getMax(int[] h) {
    int result = 0;
    for (int i = 1; i < h.length; i++) {
        if (h[i]>h[result]){
            result = i;
        }
    }
    return result;
}


    public static void main(String[] args) {
        ArrayMax arrayMax = new ArrayMax();
        int max = arrayMax.getMax(new int[]{1,3,1,1,5,2});
        System.out.println(max);
    }
}
