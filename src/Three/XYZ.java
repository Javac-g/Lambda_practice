package Three;

public class XYZ<T> extends XY<T> {

    T z;

    XYZ(T x, T y , T z){

        super(x,y);

        this.z = z;

    }
}
