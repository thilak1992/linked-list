public class UC1_Created_simple_linkedList {
    Node head;
    Node tail;


    public void add(int data) {
        /**
         * checking whether linkedlist is empty or not
         * if empty creating new node (adding)
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
}
