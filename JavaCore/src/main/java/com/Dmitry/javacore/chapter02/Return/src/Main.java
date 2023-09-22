public class Main {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("Перед возвращением.");

        if(t) return;

        System.out.println("Это не будет выполнено.");
    }
}