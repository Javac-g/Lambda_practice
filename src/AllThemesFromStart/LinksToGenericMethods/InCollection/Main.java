package AllThemesFromStart.LinksToGenericMethods.InCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MyClass> list = new ArrayList();
        list.add(new MyClass(2));
        list.add(new MyClass(7));
        list.add(new MyClass(9));

        MyClass biggestValue = Collections.max(list,MyComparator::myCompare);
        System.out.println("Max value: " + biggestValue.getValue());
    }
}
