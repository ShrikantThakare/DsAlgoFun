package StackandQueue;

import java.util.Stack;

/**
 * Created by shthakar on 3/26/17.
 */
public class QueueUsingStack {

  Stack<Integer> pushStack = new Stack<Integer>();
  Stack<Integer> popStack = new Stack<Integer>();


  public void push(Integer input) {

    pushStack.push(input);

  }

  public int pop() {

    if (popStack.isEmpty()) {

      while (!pushStack.isEmpty()) {
        popStack.push(pushStack.pop());

      }
    }
    return popStack.pop();
  }
}
