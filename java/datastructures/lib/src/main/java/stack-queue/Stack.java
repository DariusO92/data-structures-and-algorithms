package datastructures.stack-queue;

import java.util.NoSuchElementException;

public class Stack {
  Node<T> top;


public void push(T value){
  Node<T> node = new Node<T>(value);
  if(top != null){
    node.next = top;
  }
  top = node;
}

public T pop(){
  if (this.isEmpty()){
    throw new NoSuchElementException();
  } else {
  int data = top.data;
  top = top.next;
  return data;
  }

}
  public int peek(){
    if (this.isEmpty()){
      throw new NoSuchElementException();
    }
    else return top.data;
  }

  public boolean isEmpty(){
  return this.top == null;
  }
}
