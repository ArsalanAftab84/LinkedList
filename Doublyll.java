public class Doublyll {
    class Node{
    Node previous;
    int Data;
    Node next;

        public Node(int data) {
            this.Data = data;
        }
    }
    Node head;
    Node tail;
    int count = 0;
    public void print(){
        Node temp = head;
        for (int i=0; i<count; i++) {
            System.out.print(temp.Data+" ");
            temp= temp.next;
        }
        System.out.println();
    }
    public void insertEmpty(int DATA) {
        Node nn = new Node(DATA);

        this.head = nn;
        this.tail=nn;
        nn.next = this.tail;
        nn.previous = this.head;
        count++;
    }

    public void insertFirst(int DATA){
        Node nn = new Node(DATA);
        if(head==null){
            this.tail=nn;
            this.head=nn;
            this.count++;
            return;
        }
        nn.next = this.head;
        head.previous = nn;
        this.head = nn;
        this.count++;
    }

    public void insertEnd(int DATA){
        Node temp = head;
        Node nn = new Node(DATA);
        if(this.head == null){
            this.head = nn;
            this.tail = nn;
            this.count++;
            return;
        }
        nn.previous = tail;
        tail.next = nn;
        this.tail = nn;
        this.count++;
    } //insertEnd function closing

    public void insertAt(int pos, int DATA) {
        Node temp = head;
        int j = 1;
        if (pos < 0 || head == null) {
            System.out.println("the given pos is not valid");
            return;
        } else {
            while (j < pos) {
                temp = temp.next;
                j++;
            }
            Node nn = new Node(DATA);
            nn.previous = temp;
            nn.next = temp.next;
            (nn.next).previous = nn;
            temp.next = nn;
            this.count++;
        }
    }

    public void deleteStart() {
        if (head == null) {
            System.out.println("The list is empty and it does not contain any element");
        } else {
            Node temp = head;
            head = temp.next;
            temp = head.next.next;
            (temp.next).previous = head;
            head.previous = null;
        }
    }

    public void deleteAfter(int pos){
        if (pos <= 0 || head == null) {
            System.out.println("list is empty or the pos you gave is less than the size");
            return;
        }
        else {
            Node temp = head;
            int j = 1;
            while (j<pos) {
                temp = temp.next;
                j++;
            }

            temp.next = (temp.next).next;
            (temp.next).previous = temp;
            count--;
        }
    }

    public void deleteBefore(int pos){
        if (pos <= 0 || head == null) {
            System.out.println("list is empty or the pos you gave is less than the size");
        }
        if (pos == 1) {
            deleteStart();
        }
        else {
            Node temp = head;
            int j = 1;
            while (j < pos-2) {
                temp = temp.next;
                j++;
            }

            temp.next = (temp.next).next;
            (temp.next).previous = temp;
            count--;
        }

    }
}

