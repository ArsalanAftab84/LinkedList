public class QueueWithArray {
    int front = -1;
    int rear = -1;
    int count = 0;
    int n=10;
    int[] ars = new int[n];

    public void enque(int DATA){
        if(rear==n-1){
            System.out.println("can't add another element");
            return;
        }
        if(front == -1 || rear == -1){
            front++;
        }
        rear++;
        ars[rear] = DATA;

        count++;
    }

    public void deque(){
        if(count==0){
            System.out.println("there are no element in the line to deque");
        }
        else {
             for (int i = 0; i < rear - 1; i++) {
                    ars[i] = ars[i + 1];
                }

                // decrement rear
                rear--;
            }
            return;
        }
    public void printqueue(){
        for (int i=front; i<this.rear; i++) {
            System.out.print(ars[i]+ " ");
        }
    }



}
