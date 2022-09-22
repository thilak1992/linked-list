public class UC3_Linkedlist_by_appending {

    public void add(int data) {

        Node head;
        Node tail;

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

    public void addNodeAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else
            newNode.next = head;
        head = newNode;
    }

    public void display() {
        /**
         * displaying the data from node(s)
         */
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
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
}
