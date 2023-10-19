public class Singlyllist {

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    Node head;

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }


    public void insertNodeStart(int DATA){
        Node newNode = new Node(DATA);
        if(head == null){
            head = newNode;
            newNode.next = null;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAfterValue(int Value, int DATA) { // this method is for when we don't know the index of the value
        Node temp = head;
        if (head == null) {
            System.out.println("This list is empty so there no such elements exist");
        }
        else {
            while (temp.data != Value){
                temp = temp.next;
            }
        }

        Node newNode = new Node(DATA);
        newNode.next = temp.next
        ;
        temp.next = newNode;
    }


    public void deleteAtStart(){
        Node temp = head;
        if(temp==null){
            System.out.println("This list is already empty, So can't delete any value");
        }
        else{
            temp = temp.next;
            head = temp;
        }

        // Sir's method No need of ELSE
 /*       if(head==null){
            System.out.println("This list is already empty, So can't delete any value");
        }

        head = head.next;
*/
    }




    public void deleteAtEnd() {
        //Deletion with two variable
        Node temp = head;
        Node ano = temp.next;
        while (ano.next != null) {
            temp = ano;
            ano = ano.next;
        }
        temp.next = null;
    }


        //Deletion with only one variable

      /*  Node temp = head;

        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;

    }*/

    // Another Preferable method

    public void deleteAtPos(int pos){
        Node temp = head;
        //Node ano = temp.next;

        if (pos<0 || head == null) {
            System.out.println("The pos you entered does not exist or the list might be empty");
            return;
        }

        int i=1;
        while (i<pos-1){
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;

    }
}
