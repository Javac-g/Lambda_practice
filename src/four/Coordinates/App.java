package four.Coordinates;

public class App {

    static void show_XY(Map<? extends XY> object){

        for (int i = 0; i <= object.values.length-1; i++){
            System.out.println(object.values[i].x + " : X ");
            System.out.println(object.values[i].y + " : Y ");
        }
        System.out.println("-2D-");
    }
    static void show_XYZ(Map<? extends XYZ> object){
        for (int i = 0; i <= object.values.length-1; i++){
            System.out.println(object.values[i].x + " : X" );
            System.out.println(object.values[i].y + " : Y ");
            System.out.println(object.values[i].z + " : Z ");
        }
        System.out.println("-3D-");
    }
    static void show_XYZT(Map<? extends XYZT> object){
        for(int i = 0; i <= object.values.length-1;i++){
            System.out.println(object.values[i].x + " : X" );
            System.out.println(object.values[i].y + " : Y ");
            System.out.println(object.values[i].z + " : Z ");
            System.out.println(object.values[i].t + " : T ");
        }
        System.out.println("-4D-");
    }

    public static void main(String... args){
        XY[] D2 = {new XY(1,2),new XY(3,4),new XY(5,6)};
        XYZ[] D3 = {new XYZ(11,22,33), new XYZ(111,222,333), new XYZ(1111,2222,3333)};
        XYZT[] D4 = {new XYZT(1234,4321,12,33),new XYZT(1,2,3,4), new XYZT(31,3,1,3)};

        Map<XY> xy = new Map<>(D2);
        Map<XYZ> xyz = new Map<>(D3);
        Map<XYZT> xyzt = new Map<>(D4);

        show_XY(xy);
        show_XYZ(xyz);
        show_XYZT(xyzt);








    }
}
