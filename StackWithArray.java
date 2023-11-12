public class StackWithArray {
    int n = 10;
    int top= -1;
    int[] arr = new int[n];

    public StackWithArray() {

    }

    public void push(int DATA){

        if(top==n-1){
            System.out.println("Stack size limit reached");
            return;
        }
        top = top+1;
        arr[top] = DATA;
    }

    public void printStack(){
        for (int i=0; i<=this.top; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public void pop(){
        if(top==-1){
            System.out.println("No elements to pop");
            return;
        }

        System.out.println("popping the latest " +
                "element "+arr[top]);
        top--;
    }
}
