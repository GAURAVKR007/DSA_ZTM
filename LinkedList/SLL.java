class SLL {
    Node head = null;
    public int size;
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
        }
        Node newNode = new Node(data);

        Node curr = head;
        for(int i=0;i<index-1;i++){
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;


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
    }
}