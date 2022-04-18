package four.TempApp;

class Temperature {

    private int Max;

    Temperature(int Max){

        this.Max = Max;

    }

     boolean isSame(Temperature object){

        return Max == object.getMax() ;

    }
    boolean isHiger(Temperature object){
        return Max > object.getMax();
    }


    private int getMax() {
        return Max;
    }
}
