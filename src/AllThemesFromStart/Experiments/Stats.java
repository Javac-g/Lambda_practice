package AllThemesFromStart.Experiments;

public class Stats <T extends Number>{
    private final T[] nums;
    public Stats(T[] nums){
        this.nums = nums;
    }
    public T[] getNums(){
        return nums;
    }
    public Double average(){
        double sum = 0.0;
        for (int i = 0;i < nums.length;i++){
            sum+=nums[i].doubleValue();
        }
        return sum / nums.length;
    }
    public boolean isSameA(Stats <?> ob){
        return ob.average().equals(average());
    }
    public boolean isSameB(Stats<T> ob){
        return ob.average().equals(average());
    }
    public <V extends Number> boolean isSameC(Stats<V> ob){
        return ob.average().equals(average());
    }
    public <V extends Number,R extends Stats<V>> boolean isSameD(R ob){
        return ob.average().equals(average());
    }

}
