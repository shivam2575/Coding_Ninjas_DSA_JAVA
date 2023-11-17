package Stack;

public class stack_array {
    private int[] data;
    private int topIndex;

    public stack_array(){
        data = new int[5];
        topIndex = -1;
    }

    public void push(int a){
        if(topIndex==data.length-1){
            int[] temp = data;
            data = new int[data.length*2];
            for(int i=0; i<temp.length; i++){
                data[i] = temp[i];
            }
        }
        data[++topIndex] = a; 

    }

    public int pop(){
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }

    public int size(){
        return topIndex+1;
    }

    public boolean is_empty(){
        return topIndex==-1;
    }

    public int top() throws stack_empty_exception{
        if(topIndex==-1){
            throw new stack_empty_exception();
        }
        return data[topIndex];
    }

}
