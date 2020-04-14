package 两个队列实现一个栈;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesWithStack {
    Queue<Integer> queue = new LinkedList<>();
    Queue<Integer> cache = new LinkedList<>();
    public int pop(){
        while (queue.size() > 0){
            cache.add(queue.remove());
        }
        int val = queue.remove();
        while (!cache.isEmpty()){
            queue.add(cache.remove());
        }
        return val;
    }
    public void push(int val){
        queue.add(val);
    }
    public static void main(String[] args) {

    }
}
