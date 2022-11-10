package practice_10_11_2022.LinksToCOnstructors;

public class Circle <T>{
    T val;

    public Circle(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}
