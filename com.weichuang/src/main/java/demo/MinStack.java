package demo;

import org.springframework.data.redis.core.RedisTemplate;

import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private  Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || minStack.peek()>val){
            minStack.push(val);
        }
    }

    public void pop() {

        if (minStack.peek().equals(stack.pop())){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        RedisTemplate<String,String> redis = new RedisTemplate<>();
        redi
    }
}