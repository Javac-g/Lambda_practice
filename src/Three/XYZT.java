package Three;

public class XYZT<T> extends XYZ<T> {
    T t;
    XYZT(T x, T y, T z, T t){
        super(x,y,z);
        this.t = t;
    }
}
