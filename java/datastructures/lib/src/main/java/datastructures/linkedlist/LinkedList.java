package datastructures.linkedlist;

public class LinkedList {
  Node head = null;
  Node tail = null;

  public void insert(int value){
    Node newNode = new Node(value);
    if (head != null){
      newNode.next = head;
    }
    head = newNode;
  }
  public boolean includes(int value){
    boolean resluts = false
      return resluts;
  }
  @Override
  public String toString()
    {
        return "null";  // TODO: implement me
    }
}
