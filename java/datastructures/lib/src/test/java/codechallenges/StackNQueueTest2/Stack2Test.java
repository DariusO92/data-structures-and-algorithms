public class StackTest {
  public static void main(String[] args){
    Stack stack = new Stack();

    stack.push(15);
    stack.push(11);
    stack.push(25);

    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.isEmpty());
  }
}
