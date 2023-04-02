package AllThemesFromStart.LinksToGenericMethods.InCollection;

import java.util.Comparator;

public class MyComparator implements Comparator<MyClass> {
    public int compare(MyClass a1, MyClass a2){
        return a1.getValue() - a2.getValue();
    }
    public static int myCompare(MyClass a1, MyClass a2){
        return a1.getValue() - a2.getValue();
    }


}
