package five.NiceGenerics;

public class App {

    static void show_XY(Map<? extends XY> object){

        System.out.println("--- 2D ---");

        for (int i = 0 ; i <= object.array.length-1; i++){

            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");

        }
        System.out.println();
    }

    static void show_XYZ(Map<? extends XYZ> object){

        System.out.println("--- 3D ---");

        for (int i = 0; i <= object.array.length-1; i++){

            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");
            System.out.print(object.array[i].z + " ");

        }
        System.out.println();
    }

    static void shoq_XYZT(Map<? extends  XYZT> object){

        System.out.println("--- 4D ---");

        for (int i = 0; i <= object.array.length-1; i++){

            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");
            System.out.print(object.array[i].z + " ");
            System.out.print(object.array[i].t + " ");

        }
        System.out.println();
    }
    public static void main(String...args){

        XY[] A = {new XY(1,2), new XY(3,4), new XY(5,6)};
        XYZ[] B = {new XYZ(1,2,3) , new XYZ(4,5,6), new XYZ(7,8,9)};
        XYZT[] C = {new XYZT(1,2,3,4), new XYZT(5,6,7,8), new XYZT(9,10,11,12)};

        Map<XY> D2 = new Map<>(A);
        Map<XYZ> D3 = new Map<>(B);
        Map<XYZT> D4 = new Map<>(C);

        show_XY(D2);
        show_XYZ(D3);
        shoq_XYZT(D4);




    }
}
