package J1.LinksToConstructor;

public class Cube <T>{
    T w,h,l;

    Cube(T w, T h , T l){

        this.w = w;
        this.h = h;
        this.l = l;

    }

    public T getW() {
        return w;
    }

    public void setW(T w) {
        this.w = w;
    }

    public T getH() {
        return h;
    }

    public void setH(T h) {
        this.h = h;
    }

    public T getL() {
        return l;
    }

    public void setL(T l) {
        this.l = l;
    }
}
