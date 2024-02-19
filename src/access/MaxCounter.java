package access;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }

    public void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
