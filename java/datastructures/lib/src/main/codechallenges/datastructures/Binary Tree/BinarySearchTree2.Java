package Tree;




public class BinarySearchTree2 {
  Node root;
  BinarySearchTree() {root = null; }
  BinarySearchTree(int value) { root = new Node(value);}

  void add(int key){ root = addRecusively(root,key); }

  Node addRecusively(Node root, int key){
    if (root == null){
      root = new Node(key);
      return root;
    }
    else if (key < root.key)
      root.left = addRecusively(root.left,key);
    else if (key > root.key)
      root.right = addRecusively(root.right, key);
    return root;
  }

  void inorder(){inorderAddRecusively(root);}
  void inorderAddRecusively(Node root){
    if (root != null){
      inorderAddRecusively(root.left);
      System.out.println(root.key);
      inorderAddRecusively(root.right);
    }
  }



  public static void main(String[] args){
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(25);
    tree.add(45);
    tree.add(35);
    tree.add(55);
    tree.add(65);
    tree.add(15);

    tree.inorder();

  }
}
