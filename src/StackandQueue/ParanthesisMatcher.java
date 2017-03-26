package StackandQueue;

import java.util.Stack;

/**
 * Created by shthakar on 3/22/17.
 */
public class ParanthesisMatcher {

  public static boolean matcher(String input) {

    for (int i = 0; i < input.length(); i++) {

      Stack<Character> stack = new Stack<>();

      if (input.charAt(i) == '{')
        stack.push('}');

      if (input.charAt(i) == '(')
        stack.push(')');

      if (input.charAt(i) == '[')
        stack.push(']');

      if (input.charAt(i) == ']' ||
              input.charAt(i) == '}' ||
              input.charAt(i) == ')') {

        if (input.charAt(i) != stack.pop())
          return false;
      }

    }
    return true;
  }
}
