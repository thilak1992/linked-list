public class UC8_Insert_40_after_30 {
    Node head;
    Node tail;



    public Linkedlist add(int data) {
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
        return null;
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
    public Node searchInsert(int value, Node newNode) {
        Node tempNode = head;
        if(head == null) {
            System.out.println("List is Empty");
        }
        else {
            while(tempNode != null) {
                if(tempNode.data == value) {
                    break;
                }
                tempNode = tempNode.next;
            }
            Node tempNodeNext = tempNode.next;
            tempNode.next = newNode;
            newNode.next = tempNodeNext;
        }
        return tempNode;
    }

//	public Node search(int data) {
//		/**
//		 * searching all data with value given
//		 */
//		Node temp = head;
//		while (temp != null) {
//			if (temp.data == data) {
//				System.out.println(temp.data);
//			}
//			temp = temp.next;
//		}
//		return null;
//	}

    public Node addAfter(int prevNodeData, int data) {
        Linkedlist linklist= add(data);
        Node newNode =new Node(40);
        Node prvNode =searchInsert(30, newNode);
        System.out.print("Newly Added data in List : ");
        return newNode;
    }
}
