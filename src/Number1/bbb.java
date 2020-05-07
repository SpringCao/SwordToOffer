package Number1;

import java.text.DecimalFormat;
import java.util.*;
public class bbb {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int n = scanner.nextInt();
            int [][] A = new int[n][2];
            int [][] B = new int[n][2];
            for (int j = 0; j < n; j++) {
                A[j][0] = scanner.nextInt();
                A[j][1] = scanner.nextInt();
            }
            double max = -1;
            for (int j = 0; j < n; j++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                for (int k = 0; k < n; k++) {
                    double dis = getDis(A[k][0], x, A[k][1], y);
                    max = Math.max(max, dis);
                }
            }
            DecimalFormat df = new DecimalFormat("0.000");
            System.out.println(df.format(max));
        }
    }

    private static double getDis(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x1 - x2)*(x1 - x2) + (y1-y2)*(y1-y2));
    }
}
