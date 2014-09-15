class BreadthFirstSearch {
  public BreadthFirstSearch() {
    Node node = new Node();
    int key = 0;
    
    System.out.println(search(root, key));
  }

  public Node search(Node node, int key) {
    Queue<Node> queue = new Queue<Node>();
    queue.enqueue(node);

    while(!queue.isEmpty()) {
      Node node = queue.dequeue();

      if(node.value == key)
        return node;

      Node children[] = node.children();

      for(Node child : children) {
        queue.enqueue(child);
      }
    }
  }

  public static void main(String[] args) {
    new BreadthFirstSearch();
  }
}