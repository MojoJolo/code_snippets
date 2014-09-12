class CustomLinkedList {
	CustomLinkedList next = null;
	int data;

	public CustomLinkedList(int data) {
		this.data = data;
	}

	public void append(int data) {
		CustomLinkedList end = new CustomLinkedList(data);
		CustomLinkedList node = this;

		while(node.end != null) {
			node = node.next;
		}

		node.next = end;
	}

	public CustomLinkedList deleteNode(CustomLinkedList start, int data) {
		if(start.data == data)
			return start.next;

		while(start.next != null) {
			if(start.next.data == data) {
				start.next = start.next.next;
				return start;
			}

			start = node.next;
		}
	}

	public static void main(String[] args) {
		new CustomLinkedList(1);
	}
}