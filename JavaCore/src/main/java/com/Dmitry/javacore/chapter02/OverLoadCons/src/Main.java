public class Main {
    public static void main(String[] args) {
        Box myB1= new Box(10,20,15);
        Box myB2= new Box();
        Box mycube= new Box(7);

        double vol;

        vol = myB1.volume();
        System.out.println("Объем myB1 равен "+ vol);

        vol = myB2.volume();
        System.out.println("Объем myB2 равен "+ vol);

        vol = mycube.volume();
        System.out.println("Объем mycube равен "+ vol);
    }
}