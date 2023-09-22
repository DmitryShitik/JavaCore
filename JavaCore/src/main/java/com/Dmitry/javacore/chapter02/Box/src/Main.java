public class Main {
    public static void main(String[] args) {
        Box mybox= new Box();
        double vol;
        mybox.width=100;
        mybox.height=20;
        mybox.depth=15;
        vol=mybox.width* mybox.height* mybox.depth;
        System.out.println("Объем равен " + vol);
    }
}