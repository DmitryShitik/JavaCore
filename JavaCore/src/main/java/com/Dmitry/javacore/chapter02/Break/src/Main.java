public class Main {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Предшествует оператору break.");
                    if(t) break second; // break out of second block
                    System.out.println("Этот оператор не будет выполнен");
                }
                System.out.println("Этот оператор не будет выполнен");
            }
            System.out.println("Этот оператор идет за блоком second.");
        }
    }
}