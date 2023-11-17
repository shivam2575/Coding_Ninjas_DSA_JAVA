package Queue;

public class queue_array {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public queue_array(){
        this.arr = new int[5];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public int size(){
        return size;
    }

    public boolean is_empty(){
        return size==0;
    }

    public void enqueue(int ele){
        if(this.size==this.arr.length){
            double_capacity();
        }
        rear = (rear+1)%arr.length;
        this.arr[rear] = ele;
        size++;
    }

    private void double_capacity() {
        int[] temp = this.arr;
        this.arr = new int[temp.length*2];
        int index = 0;

        for(int i=front; i<temp.length; i++){
            this.arr[index++] = temp[i];
        }

        for(int i=0; i<front-1; i++){
            this.arr[index++] = temp[i];
        }

        front=0;
        rear=temp.length-1;

    }

    public int front() throws queueEmptyException{
        if(size==0){
            throw new queueEmptyException();
        }
        return arr[front];
    }

    public int dequeue() throws queueEmptyException{
        if(size==0){
            throw new queueEmptyException();
        }
        int temp = this.arr[front];
        front = (front+1)%arr.length;
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return temp;
    }


    
}
