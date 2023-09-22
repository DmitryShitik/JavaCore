public class Main {
    public static void main(String[] args) {
        BoxWeight b1 = new BoxWeight(3, 5, 7, 8.37);
        Box p1 = new Box();
        double vol;

        vol = b1.volume();
        System.out.println("Объем " + vol);
        System.out.println("Вес " + b1.weight);
        System.out.println();


        p1 = b1;

        vol = p1.volume();
        System.out.println("Объем " + vol);
        //System.out.println("Вес " + p1.weight);
    }
}