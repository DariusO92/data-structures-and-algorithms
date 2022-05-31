package datastructures.stack-queue;

public class Queue<T>{
  static class Node<T>{
    T value;
    Node<T> next;
    Node(T value){
      this.value = value;
    }
  }

  Node<T> front;
  Node<T> back;

  public void enqueue(T value){
    Node<T> node = new Node<T>(value);
    if (back != null){
      back.next = node;
    }
    back = node;
    if(front == null){
      front = node;
    }
  }

  public T dequeue() {
    if(this.isEmpty()){
      throw new NoSuchElementException();
    } else {
    T value = front.value;
    front = front.next;
    if(front == null){
      back = null;
    }
    return value;
  }

    public T peek(){
    return front.value;
  }

}
