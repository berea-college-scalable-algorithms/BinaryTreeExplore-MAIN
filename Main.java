// Class to create nodes
class Node {
  int key;
  Node left, right;

  public Node(int item) {
    key = item;
    left = right = null;
  }
}

// Class for Binary Tree
class BinaryTree {
  Node root;

  // Constructor
  public BinaryTree() {
    root = null;
  }

  // In-order Traversal
  public void traverseTree(Node node) {
    if (node != null) {
      traverseTree(node.left);
      System.out.print(" " + node.key);
      traverseTree(node.right);
    }
  }
  public static void main(String[] args) {
    // Create an object of BinaryTree
    BinaryTree tree = new BinaryTree();

    // Create nodes of the tree
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);

    System.out.print("\nBinary Tree (In-order Traversal):");
    tree.traverseTree(tree.root);
    System.out.println();
  }
}
