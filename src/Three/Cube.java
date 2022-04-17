package Three;

public class Cube<T> {
    T one;
    T two;
    T three;

    Cube(T one,T two, T three){

        this.one = one;
        this.two = two;
        this.three = three;

    }

    public T getOne() {
        return one;
    }

    public void setOne(T one) {
        this.one = one;
    }

    public T getTwo() {
        return two;
    }

    public void setTwo(T two) {
        this.two = two;
    }

    public T getThree() {
        return three;
    }

    public void setThree(T three) {
        this.three = three;
    }
}
