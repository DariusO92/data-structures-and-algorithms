package Binary Tree


class BinaryTree{
  Node root;

  BinaryTree() { root = null; }

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

  void preOrder(Node node){
    if (node == null)
      return;
    System.out.println(node.key + " ");
  }

  void postOrder() {postOrder(root);}
  void inOrder() {inOrder(root);}
  void preOrder() {preOrder(root);}

  public static void main(String[] args){
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);

    System.out.println("Preorder Traversal is");
    tree.preOrder();
    System.out.println("Postorder Traversal is");
    tree.postOrder();
    System.out.println("Inorder Traversal is");
    tree.inOrder();
  }
}
