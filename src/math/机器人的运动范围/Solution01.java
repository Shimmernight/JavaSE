package math.机器人的运动范围;

//未完成

public class Solution01 {
    public static void main(String[] args) {
        int m = 35, n = 38, k = 18;
        int i = new Solution01().movingCount(m, n, k);
        System.out.println(i);

    }

    public int movingCount(int m, int n, int k) {
        int res=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (solution(i)+solution(j)>k){
                    break;
                }else {
                    res++;
                }
            }
        }
        return res;
    }

    // 计算 x 的数位之和
    private static int solution(int x) {
        int sum = 0;
        for (; x > 0; x /= 10) {
            sum += x % 10;
        }
        return sum;
    }
}
