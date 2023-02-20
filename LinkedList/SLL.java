class SLL {
    Node head = null;
    class Node{ 
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void append(int data){
        Node newNode = new Node(data);
        Node currNode = head;
        if(head == null){
            head = newNode;
            return;
        }

        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.next = null;
    }

    public void prepend(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printSLL(){
        Node curr = head;

        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.print("null");

    }




    public static void main(String[] args) {
        SLL list = new SLL();

        list.append(15);
        list.append(33);
        list.append(21);
        list.printSLL();
    }
}