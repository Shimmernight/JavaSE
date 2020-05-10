package math.机器人的运动范围;

public class Solution {
    public static void main(String[] args) {
        int m = 2, n = 3, k = 1;
        int res = 0;

        int m1 = m/10, m2 = m%10;
        int n1 = n/10, n2 = n%10;

        if (m1==0&&n1==0){
            for (int i = 0; i < n2; i++) {
                for (int j = 0; j < m2; j++) {
                    if (i+j>k){
                        break;
                    }else {
                        res++;
                    }
                }
            }
        }
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                for (int l = 0; l < m1; l++) {
                    for (int o = 0; o < n1; o++) {
                        if (i+j+l+o>k){
                            break;
                        }else {
                            res++;
                        }
                    }
                }

            }
        }
        System.out.println(res);
    }
}
