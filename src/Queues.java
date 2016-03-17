import java.util.ArrayList;

/**
 * Created by Georgestallard10 on 15/03/2016.
 */
public class Queues {
     ArrayList<Integer> data;
    private int start = 0;
    private int end = 0;
    protected int size = 0;
    public Queues(){
        this.data = new ArrayList<>();
    }
    public void push (int a){
        this.data.add(a);
        this.end = this.end + 1;
        this.size = this.size + 1;
    }
    public void pop (){
        this.data.remove(this.end);
        this.end = this.end - 1;
        this.size = this.size - 1;
    }
    public int size (){
        return this.size;
    }
}
