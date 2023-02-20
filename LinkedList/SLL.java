class SLL {
    Node head = null;
    public int size;

    SLL(){
        this.size = 0;
    }
    class Node{ 
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
            size++;
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

        System.out.print("null\n");

    }

    public void insert(int index,int data){

        if(index>size){
            System.out.println("Invalid");
            return;
        }
        Node newNode = new Node(data);

        Node curr = head;
        for(int i=0;i<index-1;i++){
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;


    }

    public void pop(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node curr = head;
        size--;
        while(curr.next.next != null){
            curr = curr.next;
        }

        curr.next = null;
    }

    public void popFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void popInsert(int index){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(index>size){
            System.out.println("Invalid");
            return;
        }

        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        
        Node curNode = head;
        for(int i=0;i<index-1;i++){
            curNode = curNode.next;
        }
        size--;
        curNode.next = curNode.next.next;
        
    }

    public void reverse(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        if(head.next == null){
            return;
        }

        Node currNode = head.next;
        Node prevNode = head;
        Node nextNode = head.next.next;
        
        while(currNode.next != null){
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
            nextNode = nextNode.next;
        }

        currNode.next = prevNode;

        head.next = null;
        head = currNode;

    }

    public Node reverseRecursion(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }


    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        SLL list = new SLL();

        list.append(15);
        list.append(33);
        list.append(21);
        list.printSLL();
        System.out.println(list.getSize()); 
        list.prepend(1);
        list.printSLL();
        System.out.println(list.getSize()); 
        list.prepend(5);
        list.printSLL();
        list.insert(2, 11);
        list.printSLL();
        System.out.println(list.getSize()); 
        list.pop();
        list.printSLL();
        System.out.println(list.getSize()); 
        list.popFirst();
        list.printSLL();
        list.popInsert(2);
        list.printSLL();
        System.out.println(list.getSize());
        list.reverse();
        list.printSLL();
        list.append(55);
        list.printSLL();
        // list.head = list.reverseRecursion(list.head);
        // list.printSLL();

    }
}