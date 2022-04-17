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




    }
}
