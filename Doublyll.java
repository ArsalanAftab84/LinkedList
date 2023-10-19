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
        Node temp = head;
        if(temp!=null){
            Node nn = new Node(DATA);
            this.head.previous = nn;
            nn.next = this.head;
            this.head = nn;
            nn.previous = this.head;
            count++;
        }
        else {
            insertEmpty(DATA);
        }

    }

    public void insertAt(int pos, int DATA){
        if(pos<0 || head==null){
            System.out.println("the given pos is not valid");
            return;
        }

        else{
            Node nn = new Node(DATA);
            Node temp = head;
            int j=1;
            while (j<pos){
                temp = temp.next;
                j++;
            }
            nn.previous = temp;
            nn.next = temp.next;
            (nn.next).previous = nn;
            temp.next = nn;
            this.count++;
        }

    }

    public void deleteAt(int pos){
        if(pos<0||head==null){
            System.out.println("list is empty or the pos you gave is less than the size");
        }


        else {
            Node temp = head;
            int j=1;
            while(j<pos){
                temp = temp.next;
                j++;
            }

            temp.next = (temp.next).next;
            (temp.next).previous = temp;
            count--;
        }

    }







}
