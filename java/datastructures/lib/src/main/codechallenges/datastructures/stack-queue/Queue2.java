public class Queue<T> {


  public class Node<T>{
    T data;
    Queue.Node next;

    public Node(T data) {
      this.data = data;
    }
    Node front;
    Node back;

    public boolean is(){
      return front == null;
    }

    public Node peek(){
      return (Node) front.data;
    }

    public void enqueue(T data){
      Node node = new Node(data);
      if (back != null){
        back.next = node;
      }
      back = node;
      if(front == null){
        front = node;
      }
    }

    public Node dequeue(){
      Node data = (Node) front.data;
      front = front.next;
      if(front == null){
        back = null;
      }
      return data;

    }

  }
}
