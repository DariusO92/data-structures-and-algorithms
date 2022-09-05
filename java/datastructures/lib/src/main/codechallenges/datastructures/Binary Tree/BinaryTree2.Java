package Tree;

public class BinaryTree2 {
  Node root;

  BinaryTree() { root = null; }


  void preOrder(Node node){
    if (node == null)
      return;
    System.out.println(node.key + " ");
    preOrder(node.left);
    preOrder(node.right);
  }

  void postOrder(Node node){
    if (node == null)
      return;
    postOrder(node.left);
    postOrder(node.right);
    System.out.println(node.key + " ");
  }

  void inOrder(Node node){
    if (node == null)
      return;
    inOrder(node.left);
    System.out.println(node.key + " ");
    inOrder(node.right);
  }



  void postOrder() {postOrder(root);}
  void inOrder() {inOrder(root);}
  void preOrder() {preOrder(root);}

  public static void main(String[] args){
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(15);
    tree.root.left = new Node(34);
    tree.root.right = new Node(100);
    tree.root.left.left = new Node(6);
    tree.root.left.right = new Node(5);

    System.out.println("Preorder Traversal is");
    tree.preOrder();
    System.out.println("Postorder Traversal is");
    tree.postOrder();
    System.out.println("Inorder Traversal is");
    tree.inOrder();
  }
}
