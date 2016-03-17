import java.util.ArrayList;

/**
 * Created by Georgestallard10 on 08/03/2016.
 */
public class Stack {
    ArrayList<Integer> data;
    private int maxSize;
    public Stack(int size) {
        this.maxSize = size;
        this.data = new ArrayList<>();
    }
    public Stack(){
        this.maxSize = 5;
        this.data = new ArrayList<>();
    }

    public boolean isfull(){
        if (this.data.size() == this.maxSize){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty() {
        if (this.data.size() == 0) {
            return true;
        }
        else{return false;}

    }

    public int top() {
        guardAgainstEmptyException();
        int topValue = this.data.get(this.data.size() - 1);
        return topValue;
    }

    public int size() {
        return this.data.size();
    }

    public void push(int a) {
        guardAgainstFullException();
        this.data.add(a);
    }

    public void pop() {
        guardAgainstEmptyException();
        int Top = this.data.size() - 1;
        this.data.remove(Top);

    }
    public void guardAgainstEmptyException(){
        if (this.size() == 0)
        throw new StackEmptyException("Stack Empty");
    }
    public void guardAgainstFullException(){
        if (this.size() > this.maxSize){
            throw new StackFullException("Stack full");
        }
    }

}
