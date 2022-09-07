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

   public void append(int value){
    Node addToEnd = new Node(Value);
    if(head == null){
      head = addToEnd;
      tail = addToEnd;
   } else {
      tail.next = addToEnd;
      tail = addToEnd;
    }

    public insertBefore(int value, new int value){
      Node addFirst = new Node(value);
      if (head == null){
        head = addFirst;
        tail = addFirst;
      } else{
        Node temp = head;
        head = addFirst;
        head.next = temp;
      }
     }

    public insertAfter(Node head, int postition, int value){
      Node addSecond = new Node(value);
      if (postition < 1)
        System.out.println("wrong position");
      if (postition == 1){
        addSecond.next = head
        head = addSecond;
      } else {
        while (postition != 0){
          if (postition == 1){
            Node addSecond = GetNode(value);
            addSecond.next = head.next
          }
        }
      }
     }
     public kthFromEnd(Node head, int n){
      Node first = head;
      Node second = head;
      int count = 1;

      for ( int i = 1; i <= n ; i++){
        first = first.next();
      }

      while ( first != null){
        first = first.next();
        second = second.next();
      }
      return second;
     }


}

