public class UC4_Insert_30_in_between {
    Node head;
    Node tail;



    public void add(int data) {
        /**
         * checking whether linkedlist is empty or not if empty creating new node
         * (adding)
         */
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

//	public void addNodeAtFirst(int data) {
//		Node newNode = new Node(data);
//		if (head == null) {
//			head = newNode;
//			tail = newNode;
//		} else
//			newNode.next = head;
//		    head = newNode;
//	}

    public void display() {
        /**
         * displaying the data(s) from node(s)
         */
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

//	public void push(int data) {
//		/**
//		 * adding values
//		 */
//        Node newNode = new Node(data);
//        if (head == null){
//            head = newNode;
//            tail = newNode;
//        }
//        else {
//            newNode.next = head;
//            head = newNode;
//        }
//    }

//	public void insertBetween( int data, int newNode) {
//		Node newNode = new Node(data);
//		if (head == null) {
//			head = newNode;
//			tail = newNode;
//		Node tempNode = prevNode.next;
//		prevNode.next = newNode;
//		newNode.next = tempNode;
//	}

//		 public void insertAfter(int prev_node, int new_data) {
//			    if (prev_node == null) {
//			      System.out.println("The given previous node cannot be null");
//			      return;
//			    }
//			    Node new_node = new Node(new_data);
//			    new_node.next = prev_node.next;
//			    prev_node.next = new_node;
//			  }

    public void pop(int data) {
        /**
         * deleting head data
         */
        this.head = this.head.next;
    }

}
