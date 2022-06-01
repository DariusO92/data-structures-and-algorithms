package datastructures.stack-queue;

import java.util.*;

public class QseudoQueue<T> {
  public Stack<T> stack1;
  public Stack<T> stack2;

  QseudoQueue(){
    this.stack1 = new Stack<>();
    this.stack2 = new Stack<>();
  }

  static void enQueue(T value){
    while (!stack1.isEmpty()){
      stack2.push(stack1.pop());
    }
    stack1.push(value);

    while(!stack2.isEmpty()){
      stack1.push(stack2.pop());
    }
  }

  static void deQueue(){
    if (stack1.isEmpty()){
      System.out.println("Empty");
      System.exit(0);
    }
    int value = stack1.peek();
    stack1.pop();
    return value
  }

}
