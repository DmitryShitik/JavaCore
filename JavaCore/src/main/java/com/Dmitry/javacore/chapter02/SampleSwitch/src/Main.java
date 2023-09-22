public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i это ноль.");
                    break;
                case 1:
                    System.out.println("i это один.");
                    break;
                case 2:
                    System.out.println("i это два.");
                    break;
                case 3:
                    System.out.println("i это три.");
                    break;
                default:
                    System.out.println("i больше, чем 3.");
            }
    }
}