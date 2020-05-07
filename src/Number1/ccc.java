package Number1;

import java.util.*;
public class ccc {
    static Queue queue = new ArrayDeque();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer zu = sc.nextInt(); // 组数
        LinkedList[] data = new LinkedList[2]; // all data
        for (int i = 0; i < zu; i++) {
            Integer line = sc.nextInt();
            for (int j = 0; j < line; j++) {
                Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();
                result(str);
            }
        }
    }

    public static void result(String str) {
        if (str.contains("PUSH")) {
            String[] split = str.split(" ");
            PUSH(split[1]);
        } else {
            switch (str) {
                case "TOP":
                    TOP();
                    break;
                case "POP":
                    POP();
                    break;
                case "SIZE":
                    int size = SIZE();
                    System.out.println(size);
                    break;
                case "CLEAR":
                    CLEAR();
                    break;
            }
        }

    }

    public static void PUSH(Object object) {
        queue.add(object);
    }

    public static void TOP() {
        if (SIZE() < 1) {
            System.out.println("-1");
        }
        Object peek = queue.peek();
        System.out.println(peek);
    }

    public static void POP() {
        if (SIZE() < 1) {
            System.out.println("-1");
        }
        queue.poll();
    }

    public static int SIZE(){
        int size = queue.size();
        return size;
    }

    public static void CLEAR() {
        queue.clear();
    }

}
