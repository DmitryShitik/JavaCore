public class Main {
    public static void main(String[] args) {
        A supOb = new A();
        B subOb = new B();
        supOb.i=10;
        supOb.j=20;
        System.out.println("Obj supOb:");
        supOb.showij();

        subOb.i=7;
        subOb.j=8;
        subOb.k=9;
        System.out.println("Obj subOb:");
        subOb.showij();
        subOb.showk();
        System.out.println("Sum obj:");
        subOb.sum();
    }
}