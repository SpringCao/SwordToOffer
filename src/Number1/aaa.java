package Number1;

import java.text.DecimalFormat;
import java.util.*;

public class aaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            long x = scanner.nextLong();
            int k = scanner.nextInt();
            List<Long> list = new ArrayList<>(k);
            int layer = 0;
            while (x > 0) {
                x /= 2;
                layer++;
                list.add(x);
            }
            if (k >= layer) {
                System.out.println(-1);
            } else {
                System.out.println(list.get(list.size()-k-1));
            }
        }
    }
}
