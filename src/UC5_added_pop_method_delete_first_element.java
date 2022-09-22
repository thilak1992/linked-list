public class UC5_added_pop_method_delete_first_element {
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
         * displaying the data from node(s)
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
    public void pop(int data) {
        /**
         * deleting head data
         */
        this.head = this.head.next;
    }
}
