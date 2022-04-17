package Three;

public class Main {
    static void show_XY(Map<? extends XY > object){
        for(int i = 0; i <= object.array.length-1; i++){
            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");
        }
        System.out.println("X Y");
    }
    static void show_XYZ(Map<? extends XYZ> object){
        for(int i = 0; i <= object.array.length-1; i++){

            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");
            System.out.print(object.array[i].z + " ");
        }
        System.out.println("X Y Z");

    }
    static void show_XYZT(Map<? extends XYZT> object){
        for(int i = 0; i <= object.array.length-1; i++){

            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");
            System.out.print(object.array[i].z + " ");
            System.out.print(object.array[i].t + " ");

        }
        System.out.println("X Y Z T");
    }

    public static void main(String...args){
        XY[] xy = {new XY<String>("one","two"), new XY<Integer>(11,22)};
        XYZ[] xyz = {new XYZ<>("three","four","five"), new XYZ<>(1,2,3), new XYZ<>(22.1,11.2,12.12)};
        XYZT[] xyzt = {new XYZT<>(1.32F,2.33F,3.432F,4.2F), new XYZT<>(10,20,30,40),new XYZT<>('A','B','C','D')};

        Map<XY> D2 = new Map<>(xy);
        Map<XYZ> D3 = new Map<>(xyz);
        Map<XYZT> D4 = new Map<>(xyzt);

        show_XY(D2);
        show_XYZ(D3);
        show_XYZT(D4);

    }
}
