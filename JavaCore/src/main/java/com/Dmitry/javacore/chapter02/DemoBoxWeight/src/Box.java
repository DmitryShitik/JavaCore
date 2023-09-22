public class Box {
    double wight;
    double height;
    double depth;

    public Box(double wight, double height, double depth) {
        this.wight = wight;
        this.height = height;
        this.depth = depth;
    }

    public Box() {
        wight=-1;
        height=-1;
        depth=-1;
    }
    Box(double len){
        wight=height=depth=len;
    }
    double volume(){
        return wight*height*depth;
    }

}
