package datastructures.linkedlist;

public class LinkedList {
  Node head = null;
  Node tail = null;
  int insert;

  public void insert(int value){
    Node newNode = new Node(value);
    insert++;
    if (head != null){
      newNode.next = head;
    }
    head = newNode;
  }
  public boolean includes(int value){
    if (head == null) return false;
    Node currentNode = head;
    while( currentNode != null) {
      if (currentNode.value == value){
        return true;
      }
      currentNode = currentNode.next;
    }
      return false;
  }
  @Override
  public String toString()
    {
      String returnString = "";
      while (currentNode != null){
        returnString += currentNode.getData() + "\n";
        currentNode = currentNode.next;

      }
        return returnString;
    }
}
