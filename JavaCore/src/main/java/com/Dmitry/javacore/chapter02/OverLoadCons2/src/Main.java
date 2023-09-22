public class Main {
    public static void main(String[] args) {
        Box myB1= new Box(10,20,15);
        Box myB2= new Box();
        Box mycube= new Box(7);

        Box myclone= new Box(myB1);

        double vol;

        vol=myB1.volume();
        System.out.println("myB1= "+vol);

        vol=myB2.volume();
        System.out.println("myB2= "+vol);

        vol=mycube.volume();
        System.out.println("mycube= "+vol);

        vol=myclone.volume();
        System.out.println("myclone= "+vol);
    }
}