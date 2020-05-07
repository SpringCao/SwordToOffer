package 两个栈模拟一个队列;

import java.util.Scanner;
import java.util.Stack;

public class TwoStacks {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> cache = new Stack<>();
    public void push(int node){
        while (!cache.isEmpty()){
            stack.push(cache.pop());
        }
        stack.push(node);
    }
    public int pop(){
        while (!stack.isEmpty()){
            cache.push(stack.pop());
        }
        return cache.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {

        }
    }
}
