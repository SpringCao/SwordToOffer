package 两个栈模拟一个队列;

import java.util.*;

public class Main {
    static Stack<Object> s1 = new Stack<>();
    static Stack<Object> s2 = new Stack<>();
    public static void add(Object val){
        s1.push(val);
    }
    public static Object poll(){
        while (s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.peek());
                s1.pop();
            }
        }
        Object val = s2.peek();
        s2.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return val;
    }
    public static Object peek(){
        while (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        Object val = s2.peek();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            if (str.startsWith("add")){
                add(Integer.parseInt(str.substring(4)));
            }
            if (str.equals("peek")){
                System.out.println(peek());
            }
            if (str.equals("poll")){
                poll();
            }
        }
    }
}
