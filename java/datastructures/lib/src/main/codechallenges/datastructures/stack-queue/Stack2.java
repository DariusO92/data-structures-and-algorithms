import java.util.NoSuchElementException;

public class Stack <T> {
  public class Node<T>{
    T data;
    Node<T> next;

    public Node(T data) {
      this.data = data;

    }
  }

  public Node top;


  public void push(T value){
    Node<T> node = new Node<>(value);
    if(top != null){
      node.next = top;
    }
    top = node;
  }

  public T pop(){
    if (this.isEmpty()){
      throw new NoSuchElementException();
    } else {
      T data = (T) top.data;
      top = top.next;
      return data;
    }

  }
  public Node<T> peek(){
    if (this.isEmpty()){
      throw new NoSuchElementException();
    }
    else return top;
  }

  public boolean isEmpty(){
    return this.top == null;
  }
}
