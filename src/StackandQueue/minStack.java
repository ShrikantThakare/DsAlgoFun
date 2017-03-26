package StackandQueue;

import java.util.Stack;

/**
 * Created by shthakar on 3/26/17.
 */
public class minStack {

  // At every push check if data in minstack is less than the value.
  // If yes then push the value in minstack too
  // If no then push the old value in min and new value in stack


  Stack<Integer> stack = new Stack<>();
  Stack<Integer> minStack = new Stack<>();

  public void push(int input) {

    stack.push(input);

    if (minStack.isEmpty() || input <= minStack.peek()) {
      minStack.push(input);
    } else if (input > minStack.peek()) {
      minStack.push(minStack.peek());
    }


  }

  public int pop() {
    minStack.pop();
    return stack.pop();
  }

  public int min() {
    return stack.peek();
  }


}