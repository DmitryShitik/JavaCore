public class Main {
    public static void main(String[] args) {
        BoxWeight b1= new BoxWeight(10,20,15,34.3);
        BoxWeight b2=new BoxWeight(2,3,4,0.076);
        double vol;

        vol=b1.volume();
        System.out.println("Объем "+vol);
        System.out.println("Вес "+b1.weight);

        vol=b2.volume();
        System.out.println("Объем "+vol);
        System.out.println("Вес "+b2.weight);
    }
}