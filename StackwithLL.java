public class StackwithLL {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    Node top=null;
    int size;


    public void pushinll(int DATA){
        Node nn = new Node(DATA);
        if (top==null){
            nn.next = null;
        }
        else{
            nn.next = top;
        }
        top = nn;
        size++;
    }

    public boolean isEmpty(){
        return (top == null);
    }

    public int peekinll() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void popinll(){
        if(top==null){
            System.out.println("Stack Underflow, No element to pop");
            return;
        }
        top = top.next;
        size--;
    }

    public void displayStackinll(){
        System.out.println();
        Node temp = top;
        while (temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }

}
