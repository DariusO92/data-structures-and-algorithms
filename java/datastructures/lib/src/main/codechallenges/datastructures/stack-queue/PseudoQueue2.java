public class PseudoQueue {
  static Stack<Integer> stack1 = new Stack<>();
  static Stack<Integer> stack2 = new Stack<>();

  static void enQueue(int x){
    while (!stack1.isEmpty()){
      stack2.push(stack1.pop());
    }

    stack1.push(x);

    while (!stack2.isEmpty()){
      stack1.push(stack2.pop());
    }
  }

  static Stack<Integer>.Node<Integer> deQueue(){
    if (stack1.isEmpty()){
      System.out.println("Queue is empty.");
      System.exit(0);
    }
    Stack<Integer>.Node<Integer> x = stack1.peek();
    stack1.pop();
    return x;
  }
  public static void main(String[] args){
    PseudoQueue queue = new PseudoQueue();
    queue.enQueue(3);
    queue.enQueue(2);
    queue.enQueue(1);


    System.out.println(deQueue());
  }
}
