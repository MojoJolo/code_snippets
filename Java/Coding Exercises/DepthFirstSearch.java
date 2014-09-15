class DepthFirstSearch {
  public DepthFirstSearch() {
    Node root = new Node();
    int key = 0;

    if(root.value == key)
      System.out.println(root.name);
    else
      System.out.println(search(root, key));
  }

// Add a "visited" flag if traversing a graph instead of tree
  public Node search(Node node, int key) {
    Node children[] = node.children();

    for(Node child : children) {
      if(child.value == key)
        return child;
      else
        search(child, key);
    }
  }

  public static void main(String[] args) {
    new DepthFirstSearch();
  }
}