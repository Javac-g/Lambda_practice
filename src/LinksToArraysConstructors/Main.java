package LinksToArraysConstructors;

import java.util.Arrays;

public class Main {
    public static void main(String...args){
        Tool<MyClass[]> tool = MyClass[]::new;

        MyClass[] arr = tool.func(5);
        arr[0] = new MyClass(31);
        arr[1] = new MyClass(42);
        arr[2] = new MyClass(85);
        arr[3] = new MyClass(12);
        arr[4] = new MyClass(41);

    }
}
