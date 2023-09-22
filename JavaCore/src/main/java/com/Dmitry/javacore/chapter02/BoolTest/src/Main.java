public class Main {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b: " + b);
        b = true;
        System.out.println("b: " + b);

        if(b) System.out.println("Running...");
        b = false;
        if(b) System.out.println("Not running.");

        System.out.println("1 > 0: " + (1 > 0));
    }
}